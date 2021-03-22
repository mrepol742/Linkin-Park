package com.android.DROID_MJ.linkinpark;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.WindowManager;

public class g extends Activity {
        protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.a);
        }
        super.onCreate(bundle);
        setContentView(R.layout.g);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
   }
}