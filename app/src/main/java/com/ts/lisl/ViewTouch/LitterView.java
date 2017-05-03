package com.ts.lisl.ViewTouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by lisl on 17-5-2.
 */

public class LitterView extends View {
    private final String TAG = LitterView.class.getSimpleName();
    public LitterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        /*
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
        */
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG,"lisl dispatchTouchEvent event:"+event.getActionMasked());
        return super.dispatchTouchEvent(event);
        //return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,"lisl onTouchEvent event:"+event.getActionMasked());
        return super.onTouchEvent(event);
        //return true;
    }

}
