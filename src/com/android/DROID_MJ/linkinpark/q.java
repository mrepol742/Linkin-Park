package com.android.DROID_MJ.linkinpark;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class q extends Activity {
	  protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.f);
        }
        super.onCreate(bundle);
        setContentView(R.layout.c4);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.c, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.s:
                q1();
                return true;
            case android.R.id.home:
       startActivity(new Intent(this, a.class));
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
         }
    }

    private void q1() {
        EditText editText = (EditText) findViewById(R.id.p);
        String editable = ((EditText) findViewById(R.id.q)).getText().toString();
        String editable2 = editText.getText().toString();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"mrepol742@gmail.com"});
        intent.putExtra("android.intent.extra.SUBJECT", "Linkin Park v4.0: " + editable);
        intent.putExtra("android.intent.extra.TEXT", editable2);
        intent.putExtra("android.intent.extra.CC", "mrepol742@gmail.com");
        intent.setType("text/html");
        intent.setPackage("com.google.android.gm");
        startActivity(Intent.createChooser(intent, "Send mail"));
    }
}

