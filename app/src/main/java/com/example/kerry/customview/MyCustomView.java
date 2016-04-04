package com.example.kerry.customview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Kerry on 2016/4/4.
 */
public class MyCustomView extends View {
    public MyCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        ScreenUtility.init((Activity) context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(measureWidth(widthMeasureSpec), measureHeight(heightMeasureSpec));
    }

    private int measureWidth(int measureSpec) {
        int result = 0;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if(specMode == MeasureSpec.EXACTLY) {
            result = (int) (specSize * ScreenUtility.ratio);
        } else {
            result = 200;
            if(specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }

        return result;
    }
    private int measureHeight(int measureSpec) {
        int result = 0;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if(specMode == MeasureSpec.EXACTLY) {
            result = (int) (specSize * ScreenUtility.ratio);
        } else {
            result = 200;
            if(specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }

        return result;
    }
}
