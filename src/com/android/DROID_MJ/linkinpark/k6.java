package com.android.DROID_MJ.linkinpark;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.Menu;
import android.view.MenuItem;

public class k6 extends Activity {
        protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.a);
        }
        super.onCreate(bundle);
        setContentView(R.layout.a18);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
   }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.b, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.o:
       startActivity(new Intent(this, a.class));
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
         }
    }
}