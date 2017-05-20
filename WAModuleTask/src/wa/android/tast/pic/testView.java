package wa.android.tast.pic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.Bitmap.Config;
import android.util.AttributeSet;
import android.view.View;

public class testView extends View {
        private Bitmap mbmpTest = null;
        private final Paint mPaint = new Paint();
        private final String mstrTitle = "感受Android带给我们的新体验";

        public testView(Context context, AttributeSet attrs, int defStyle) {
                super(context, attrs, defStyle);
                mPaint.setColor(Color.GREEN);
        }

        public testView(Context context, AttributeSet attrs) {
                super(context, attrs);
                mPaint.setColor(Color.GREEN);
        }

        public boolean initBitmap(int w, int h, int c) {
//返回具有指定宽度和高度可变的位图,它的初始密度可以调用getDensity()
                mbmpTest = Bitmap.createBitmap(w, h, Config.ARGB_8888);
//把一个具有指定的位图绘制到画布上。位图必须是可变的。
//在画布最初的目标密度是与给定的位图的密度相同,返回一个具有指定位图的画布
                Canvas canvas = new Canvas(mbmpTest);
//设置画布的颜色
                canvas.drawColor(Color.WHITE);
                Paint p = new Paint();
                String familyName = "宋体";
                Typeface font = Typeface.create(familyName, Typeface.BOLD);
                p.setColor(Color.RED);
                p.setTypeface(font);
                p.setTextSize(22);
//0,100指定文字的起始位置
                canvas.drawText(mstrTitle, 0, 100, p);
                return true;
        }

        @Override
        public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (mbmpTest != null) {
                        Matrix matrix = new Matrix();
                        // matrix.postScale(0.5f, 0.5f);
//以 120，120这个点位圆心 旋转90度
                        // matrix.setRotate(90,120,120);
//使用指定的矩阵绘制位图
                        canvas.drawBitmap(mbmpTest, matrix, mPaint);
                }
        }
}

