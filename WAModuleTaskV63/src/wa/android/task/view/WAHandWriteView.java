package wa.android.task.view;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

import com.example.wamoduletaskv63.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

@SuppressLint("ResourceAsColor")
public class WAHandWriteView extends View{
	
	Bitmap m = null;
	float startx = -1;
	float starty = -1;
	Paint p = null;
	private int width;
	private Bitmap lastBitmap = null;
	@SuppressLint("ResourceAsColor")
	public WAHandWriteView(Context context, AttributeSet attrs) {
		super(context, attrs);
		if (m == null) {
			int screenwidth = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getWidth();		
			width =screenwidth;
			m = createBitmap(width);
			m.eraseColor(Color.WHITE);
		}
		if (p == null) {
			p = new Paint();
			p.setStrokeWidth(5);
			p.setColor(Color.rgb(30, 64, 110));
			
		}
	

	}
	public void setInitbitmap(Bitmap bitmap){
		this.lastBitmap = bitmap;
		updatePaint();
	}
	private Bitmap createBitmap(int width) {
		// TODO Auto-generated method stub
		Bitmap bitmap = null;
		WindowManager wm = (WindowManager) getContext() 
                .getSystemService(Context.WINDOW_SERVICE); 
		int widthWM = wm.getDefaultDisplay().getWidth();
		int heightWM = wm.getDefaultDisplay().getHeight();

		/*if(width>640){
			bitmap = Bitmap.createBitmap(720, 1000, Bitmap.Config.ARGB_8888);
		}
		else{
		}*/
		bitmap = Bitmap.createBitmap(widthWM, heightWM, Bitmap.Config.ARGB_8888);	;
		return bitmap;
	}
	@Override
	public void onDraw(Canvas canvas) {
		Log.d(getClass().getName(), "onDraw");
		canvas.drawBitmap(m, 0, 0, new Paint());
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		int action = event.getAction();
		Log.d(getClass().getName(), String.valueOf(action));
		switch(action) {
		case MotionEvent.ACTION_DOWN:
			startx = event.getX();
			starty = event.getY();
			newL(startx, starty);
			break;
		case MotionEvent.ACTION_MOVE:
			if (startx == -1) {
				startx = event.getX();
				starty = event.getY();
				newL(startx, starty);
			} else {
				Canvas c = new Canvas(m);
				c.drawLine(startx, starty, event.getX(), event.getY(), p);
				startx = event.getX();
				starty = event.getY();
				newP(startx, starty);
			}
		}
		this.invalidate();
		return true;
		
	}
	
	public void clear(){
		m = createBitmap(width);

		redoList.removeAllElements();
		lineList.removeAllElements();
		this.invalidate();
	}
	
	public void save(String path){
		try {
			File f = new File(path);
			if (f.exists()) {
				f.delete();
			}
			f.createNewFile();
			FileOutputStream fos = null;
			fos = new FileOutputStream(f);
			m.compress(CompressFormat.PNG, 100, fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Stack<ArrayList<Point>> lineList = new Stack<ArrayList<Point>>();
	private Stack<ArrayList<Point>> redoList = new Stack<ArrayList<Point>>();
	private ArrayList<Point> currentLine = null;
	
	public void newL(float x, float y){
//		if (currentLine != null) {
//			lineList.push(currentLine);
//		}
		currentLine = new ArrayList<Point>();
		newP(x, y);
		lineList.push(currentLine);
		redoList.removeAllElements();
	}
	
	public void newP(float x, float y){
		Point p = new Point();
		p.x = x;
		p.y = y;
		currentLine.add(p);
	}
	
	public void undo(){
		try{
			ArrayList<Point> undo = lineList.pop();
			redoList.push(undo);
		} catch(EmptyStackException e) {
			lastBitmap = null;
		}
		updatePaint();
	}
	
	public void redo(){
		try{
			ArrayList<Point> redo = redoList.pop();
			lineList.push(redo);
			updatePaint();
		} catch(EmptyStackException e) {
		}
	}
	
	public void updatePaint(){
		m =createBitmap(width);
		if (lastBitmap != null) {
			Canvas c = new Canvas(m);
			c.drawBitmap(lastBitmap, 0, 0, p);
		}
		for (ArrayList<Point> line : lineList) {
			float startx = -1;
			float starty = -1;
			for (Point point : line) {
				if (startx == -1) {
					startx = point.x;
					starty = point.y;
				} else {
					Canvas c = new Canvas(m);
					c.drawLine(startx, starty, point.x, point.y, p);
					startx = point.x;
					starty = point.y;
				}
			}
		}
		this.invalidate();
	}
	
	class Point{
		float x = -1;
		float y = -1;
	}
}
