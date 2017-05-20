package com.yonyou.uap.um.control.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.yonyou.uap.um.util.ResourceUtil;

public class XListView extends ListView
  implements AbsListView.OnScrollListener
{
  private float mLastY = -1.0F;
  private Scroller mScroller;
  private AbsListView.OnScrollListener mScrollListener;
  private IXListViewListener mListViewListener;
  public XListViewHeader mHeaderView;
  private RelativeLayout mHeaderViewContent;
  private TextView mHeaderTimeView;
  private int mHeaderViewHeight;
  private boolean mEnablePullRefresh = true;
  private boolean mPullRefreshing = false;
  public XListViewFooter mFooterView;
  private boolean mEnablePullLoad;
  private boolean mPullLoading;
  private boolean mIsFooterReady = false;
  private int mTotalItemCount;
  private int mScrollBack;
  private static final int SCROLLBACK_HEADER = 0;
  private static final int SCROLLBACK_FOOTER = 1;
  private static final int SCROLL_DURATION = 400;
  private static final int PULL_LOAD_MORE_DELTA = 50;
  private static final float OFFSET_RADIO = 1.8F;

  public XListView(Context context)
  {
    super(context);
    initWithContext(context);
  }

  public XListView(Context context, AttributeSet attrs) {
    super(context, attrs);
    initWithContext(context);
  }

  public XListView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    initWithContext(context);
  }

  private void initWithContext(Context context) {
    this.mScroller = new Scroller(context, new DecelerateInterpolator());

    super.setOnScrollListener(this);

    this.mHeaderView = new XListViewHeader(context);
    this.mHeaderViewContent = ((RelativeLayout)this.mHeaderView.findViewById(ResourceUtil.getId(getContext(), "xlistview_header_content")));

    this.mHeaderTimeView = ((TextView)this.mHeaderView.findViewById(ResourceUtil.getId(getContext(), "xlistview_header_time")));

    addHeaderView(this.mHeaderView);

    this.mFooterView = new XListViewFooter(context);

    this.mHeaderView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        XListView.this.mHeaderViewHeight = XListView.this.mHeaderViewContent.getHeight();
        XListView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
      }
    });
    this.mFooterView.setVisibility(8);
    this.mHeaderView.setVisibility(8);
  }

  public void setAdapter(ListAdapter adapter)
  {
    if (!this.mIsFooterReady) {
      this.mIsFooterReady = true;
      addFooterView(this.mFooterView);
    }
    super.setAdapter(adapter);
  }

  public void setPullRefreshEnable(boolean enable)
  {
    this.mEnablePullRefresh = enable;
    if (!this.mEnablePullRefresh)
      this.mHeaderViewContent.setVisibility(4);
    else
      this.mHeaderViewContent.setVisibility(0);
  }

  public void setPullLoadEnable(boolean enable)
  {
    this.mEnablePullLoad = enable;
    if (!this.mEnablePullLoad) {
      this.mFooterView.hide();
      this.mFooterView.setOnClickListener(null);
    } else {
      this.mPullLoading = false;
      this.mFooterView.show();
      this.mFooterView.setState(0);

      this.mFooterView.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View v) {
          XListView.this.startLoadMore();
        }
      });
    }
  }

  public void stopRefresh()
  {
    if (this.mPullRefreshing == true) {
      this.mPullRefreshing = false;
      resetHeaderHeight();
    }
  }

  public void stopLoadMore()
  {
    if (this.mPullLoading == true) {
      this.mPullLoading = false;
      this.mFooterView.setState(0);
    }
  }

  public void setRefreshTime(String time)
  {
    this.mHeaderTimeView.setText(time);
  }

  private void invokeOnScrolling() {
    if ((this.mScrollListener instanceof OnXScrollListener)) {
      OnXScrollListener l = (OnXScrollListener)this.mScrollListener;
      l.onXScrolling(this);
    }
  }

  private void updateHeaderHeight(float delta) {
    this.mHeaderView.setVisiableHeight((int)delta + this.mHeaderView.getVisiableHeight());

    if ((this.mEnablePullRefresh) && (!this.mPullRefreshing)) {
      if (this.mHeaderView.getVisiableHeight() > this.mHeaderViewHeight)
        this.mHeaderView.setState(1);
      else {
        this.mHeaderView.setState(0);
      }
    }
    setSelection(0);
  }

  private void resetHeaderHeight()
  {
    int height = this.mHeaderView.getVisiableHeight();
    if (height == 0) {
      return;
    }
    if ((this.mPullRefreshing) && (height <= this.mHeaderViewHeight)) {
      return;
    }
    int finalHeight = 0;

    if ((this.mPullRefreshing) && (height > this.mHeaderViewHeight)) {
      finalHeight = this.mHeaderViewHeight;
    }
    this.mScrollBack = 0;
    this.mScroller.startScroll(0, height, 0, finalHeight - height, 400);

    invalidate();
  }

  private void updateFooterHeight(float delta) {
    int height = this.mFooterView.getBottomMargin() + (int)delta;
    if (height > 100)
      resetFooterHeight();
    if ((this.mEnablePullLoad) && (!this.mPullLoading)) {
      if (height > 50)
      {
        this.mFooterView.setState(1);
      }
      else this.mFooterView.setState(0);
    }

    if (this.mEnablePullLoad)
      this.mFooterView.setBottomMargin(height);
  }

  private void resetFooterHeight()
  {
    int bottomMargin = this.mFooterView.getBottomMargin();
    if (bottomMargin > 0) {
      this.mScrollBack = 1;
      this.mScroller.startScroll(0, bottomMargin, 0, -bottomMargin, 400);

      invalidate();
    }
  }

  private void startLoadMore() {
    this.mPullLoading = true;
    this.mFooterView.setState(2);
    if (this.mListViewListener != null)
      this.mListViewListener.onLoadMore();
  }

  public boolean onTouchEvent(MotionEvent ev)
  {
    if (this.mLastY == -1.0F) {
      this.mLastY = ev.getRawY();
    }

    switch (ev.getAction()) {
    case 0:
      this.mLastY = ev.getRawY();
      break;
    case 2:
      float deltaY = ev.getRawY() - this.mLastY;
      this.mLastY = ev.getRawY();
      if ((getFirstVisiblePosition() == 0) && ((this.mHeaderView.getVisiableHeight() > 0) || (deltaY > 0.0F)))
      {
        updateHeaderHeight(deltaY / 1.8F);
        invokeOnScrolling();
      } else if ((getLastVisiblePosition() == this.mTotalItemCount - 1) && ((this.mFooterView.getBottomMargin() > 0) || (deltaY < 0.0F)))
      {
        updateFooterHeight(-deltaY / 1.8F); } break;
    default:
      this.mLastY = -1.0F;
      if (getFirstVisiblePosition() == 0)
      {
        if ((this.mEnablePullRefresh) && (this.mHeaderView.getVisiableHeight() > this.mHeaderViewHeight))
        {
          this.mPullRefreshing = true;
          this.mHeaderView.setState(2);
          if (this.mListViewListener != null) {
            this.mListViewListener.onRefresh();
          }
        }
        resetHeaderHeight();
      } 
      //由原来的else if 改成if 防止本页数据过少时，下载状态改变，确没有刷新
      if (getLastVisiblePosition() == this.mTotalItemCount - 1)
      {
        if ((this.mEnablePullLoad) && (this.mFooterView.getBottomMargin() > 50))
        {
          startLoadMore();
        }
        resetFooterHeight();
      }
      break;
    }
    return super.onTouchEvent(ev);
  }

  public void computeScroll()
  {
    if (this.mScroller.computeScrollOffset()) {
      if (this.mScrollBack == 0)
        this.mHeaderView.setVisiableHeight(this.mScroller.getCurrY());
      else {
        this.mFooterView.setBottomMargin(this.mScroller.getCurrY());
      }
      postInvalidate();
      invokeOnScrolling();
    }
    super.computeScroll();
  }

  public void setOnScrollListener(AbsListView.OnScrollListener l)
  {
    this.mScrollListener = l;
  }

  public void onScrollStateChanged(AbsListView view, int scrollState)
  {
    if (this.mScrollListener != null)
      this.mScrollListener.onScrollStateChanged(view, scrollState);
  }

  public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount)
  {
    this.mTotalItemCount = totalItemCount;
    if (this.mScrollListener != null)
      this.mScrollListener.onScroll(view, firstVisibleItem, visibleItemCount, totalItemCount);
  }

  public void setXListViewListener(IXListViewListener l)
  {
    this.mListViewListener = l;
  }

  public static abstract interface IXListViewListener
  {
    public abstract void onRefresh();

    public abstract void onLoadMore();
  }

  public static abstract interface OnXScrollListener extends AbsListView.OnScrollListener
  {
    public abstract void onXScrolling(View paramView);
  }
}