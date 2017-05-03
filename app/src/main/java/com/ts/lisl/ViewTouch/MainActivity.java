package com.ts.lisl.ViewTouch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;

import com.ts.lisl.viewtouchtest.R;

public class MainActivity extends Activity{

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(ev.getAction() != MotionEvent.ACTION_DOWN) {
            //return true;
        }
        Log.e(TAG,"lisl dispatchTouchEvent ev:"+ev.getActionMasked());
        return super.dispatchTouchEvent(ev);
        //return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,"lisl onTouchEvent event:"+event.getActionMasked());
        return super.onTouchEvent(event);
    }
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        Log.e(TAG,"lisl dispatchKeyEvent event:"+event.getAction()+"/"+event.getKeyCode()+"/"+event.getRepeatCount());
        return super.dispatchKeyEvent(event);
        //return false;
    }

    @Override
    public void onUserInteraction() {
        Log.e(TAG,"lisl onUserInteraction");
        super.onUserInteraction();
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.e(TAG,"lisl onKeyLongPress keyCode:"+keyCode +", event:"+event.getAction()+"/"+event.getKeyCode());
        return super.onKeyLongPress(keyCode, event);
        //return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.e(TAG,"lisl onKeyDown keyCode:"+keyCode+", event:"+event.getAction());
        return super.onKeyDown(keyCode,event);
        /*
        if(event.getRepeatCount() == 0) {
            //Log.e(TAG,"lisl onKeyDown event:"+event.getAction()+", return true");
            event.startTracking();
            return true;
        } else {
            //Log.e(TAG,"lisl onKeyDown event:"+event.getAction()+", return false");
            return false;
        }
        */
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Log.e(TAG,"lisl onKeyUp keyCode:"+keyCode+", event:"+event.getAction());
        return super.onKeyUp(keyCode, event);
    }
}
