package com.ts.lisl.ViewTouch;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by lisl on 17-4-27.
 */

public final class LitterButton extends Button {

    private final String TAG = LitterButton.class.getSimpleName();

    public LitterButton(Context context) {
        super(context);
    }

    public LitterButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Log.e(TAG,"lisl onKey keyCode:"+keyCode+",event:"+event.getAction());
                return false;
            }
        });
        this.setOnLongClickListener(
                new OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        Log.e(TAG,"lisl onLongClick ");
                        return false;
                    }
                }
        );
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(TAG,"onDraw");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.e(TAG,"onLayout");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG,"onMeasure");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG,"lisl dispatchTouchEvent event:"+event.getActionMasked());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,"lisl onTouchEvent event:"+event.getActionMasked());
        return super.onTouchEvent(event);
        //return false;
    }
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        Log.e(TAG,"lisl dispatchKeyEvent event:"+event.getAction()+"/"+event.getKeyCode()+"/"+event.getRepeatCount());
        return super.dispatchKeyEvent(event);
        //return false;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.e(TAG,"lisl onKeyLongPress keyCode:"+keyCode +", event:"+event.getAction()+"/"+event.getKeyCode());
        return super.onKeyLongPress(keyCode, event);
        //return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.e(TAG, "lisl onKeyDown keyCode:" + keyCode + ", event:" + event.getAction());
        //return false;
        return super.onKeyDown(keyCode,event);
        /*
        if (event.getRepeatCount() == 0) {
            //Log.e(TAG,"lisl onKeyDown event:"+event.getAction()+", return true");
            event.startTracking();
            return true;
        } else {
            //Log.e(TAG,"lisl onKeyDown event:"+event.getAction()+", return false");
            return false;
        }
        */
    }
}
