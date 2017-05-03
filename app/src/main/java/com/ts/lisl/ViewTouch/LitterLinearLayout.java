package com.ts.lisl.ViewTouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by lisl on 17-4-28.
 */

public final class LitterLinearLayout extends LinearLayout {

    private final String TAG = LitterLinearLayout.class.getSimpleName();

    public LitterLinearLayout(Context context) {
        super(context);
    }

    public LitterLinearLayout(Context context, AttributeSet attrs) {
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
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG,"lisl onInterceptTouchEvent ev:"+ev.getActionMasked());
        return super.onInterceptTouchEvent(ev);
        //return true;
    }
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        Log.e(TAG,"lisl dispatchKeyEvent event:"+event.getAction()+"/"+event.getKeyCode()+"/"+event.getRepeatCount());
        return super.dispatchKeyEvent(event);
        //return true;
    }

    /*
    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.e(TAG,"lisl onKeyLongPress keyCode:"+keyCode +", event:"+event.getAction()+"/"+event.getKeyCode());
        return super.onKeyLongPress(keyCode, event);
        //return true;
    }
    */

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.e(TAG, "lisl onKeyDown keyCode:" + keyCode + ", event:" + event.getAction());
        return super.onKeyDown(keyCode,event);
        //return true;
    }
}
