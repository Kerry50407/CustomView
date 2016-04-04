package com.example.kerry.customview;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;

/**
 * 
 * @author Kerry
 * 調整畫面view比例的工具
 *
 */
public class ScreenUtility {
	public static int widthPixels = -1;
	public static int heightPixels = -1;
	public static float ratio = -1;

	public static void init(Activity a) {
		DisplayMetrics dm = new DisplayMetrics();
		a.getWindowManager().getDefaultDisplay().getMetrics(dm);
		widthPixels = dm.widthPixels;
		heightPixels = dm.heightPixels;

		ratio = (widthPixels > heightPixels) ? ((float) widthPixels / 1280)
				: ((float) widthPixels / 800);

		Log.d("ScreenUtility", "widthPixels = " + widthPixels);
		Log.d("ScreenUtility", "heightPixels = " + heightPixels);
		Log.d("ScreenUtility", "ratio = " + ratio);
	}
}