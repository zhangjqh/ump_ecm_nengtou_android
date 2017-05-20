package wa.android.libs.pagerview;

import java.util.List;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class WAPagerView extends ViewPager{

	private List<View> views;
	private int count;
	private int currentPosition;
	public WAPagerView(Context context) {
		super(context);
	}

	public WAPagerView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * 添加界面
	 * @param views
	 */
	public void setViews(List<View> views, final OnWAPageChangeListener listener) {
		this.views = views;
		if(views != null && views.size() > 0) {
			count = views.size();
			setAdapter(new MyPageAdapter());
			setOnPageChangeListener(new OnPageChangeListener() {
				
				@Override
				public void onPageSelected(int arg0) {
					if(listener != null)
						listener.onPageSelected(arg0);
				}
				
				@Override
				public void onPageScrolled(int arg0, float arg1, int arg2) {
				}
				
				@Override
				public void onPageScrollStateChanged(int arg0) {
				}
			});
			setCurrentItem(0);
			currentPosition = 0;
		}
	}
	
	/**
	 * 翻到上一页
	 * return 翻页后的位置
	 */
	public int previousPage() {
		if(views != null)
			if(currentPosition > 0)
				setCurrentItem(--currentPosition);
		return currentPosition;
	}
	
	/**
	 * 翻到下一页
	 * return 翻页后的位置
	 */
	public int nextPage() {
		if(views != null) {
			int count = views.size();
			if(currentPosition < count -1)
				setCurrentItem(++currentPosition);
		}
		return currentPosition;
	}
	
	
	@Override
	public void setCurrentItem(int item, boolean smoothScroll) {
		// TODO Auto-generated method stub
		if(item < count && count >= 0 && item >= 0) {
			super.setCurrentItem(item, smoothScroll);
			this.currentPosition = item;
		}
	}

	@Override
	public void setCurrentItem(int item) {
		if(item < count && count >= 0 && item >= 0) {
			super.setCurrentItem(item);
			this.currentPosition = item;
		}
	}



	class MyPageAdapter extends PagerAdapter {
		@Override
		public boolean isViewFromObject(View view, Object o) {
			// TODO Auto-generated method stub
			return view == o;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return views.size();
		}

		@Override  
        public Object instantiateItem(View view, int position) {  
            // TODO Auto-generated method stub  
            ((ViewPager)view).addView(views.get(position),0);  
            return views.get(position);  
        } 
		
		@Override
		public int getItemPosition(Object object) {
			// TODO Auto-generated method stub
			return super.getItemPosition(object);
		}

		@Override
		public CharSequence getPageTitle(int position) {
			// TODO Auto-generated method stub
			return super.getPageTitle(position);
		}

		@Override
		public float getPageWidth(int position) {
			// TODO Auto-generated method stub
			return super.getPageWidth(position);
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			// TODO Auto-generated method stub
			return super.instantiateItem(container, position);
		}

		@Override
		public void destroyItem(ViewGroup container, int position,
				Object object) {
			// TODO Auto-generated method stub
			//super.destroyItem(container, position, object);
			((ViewPager)container).removeView(views.get(position));
		}
	}
	
	public interface OnWAPageChangeListener {
		public void onPageSelected(int position);
	}
	
}
