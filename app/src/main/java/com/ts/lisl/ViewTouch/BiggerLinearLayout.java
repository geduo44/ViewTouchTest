package com.ts.lisl.ViewTouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by lisl on 17-5-2.
 */

public class BiggerLinearLayout extends LinearLayout {

    private final String TAG = BiggerLinearLayout.class.getSimpleName();

    public BiggerLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG,"lisl dispatchTouchEvent ev:"+ev.getActionMasked());
        return super.dispatchTouchEvent(ev);
        //return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,"lisl onTouchEvent ev:"+event.getActionMasked());
        return super.onTouchEvent(event);
        //return true;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        Log.e(TAG,"lisl dispatchKeyEvent event:"+event.getAction()+"/"+event.getKeyCode()+"/"+event.getRepeatCount());
        return super.dispatchKeyEvent(event);
        //return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.e(TAG, "lisl onKeyDown keyCode:" + keyCode + ", event:" + event.getAction());
        return super.onKeyDown(keyCode,event);
        //return true;
    }
}
