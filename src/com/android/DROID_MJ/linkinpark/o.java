package com.android.DROID_MJ.linkinpark;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.view.WindowManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class o extends Activity {
    ListView listView;

    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.f);
        }
        super.onCreate(bundle);
        setContentView(R.layout.c);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.listView = (ListView) findViewById(R.id.c);
        this.listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, new String[]{"Place To Start", "Over Again", "Watching As I Fall", "Nothing Makes Sense Anymore", "About You", "Promises I Can't Keep", "Crossing A Line", "Ghost", "Make It Up As I Go", "Running From My Shadow"}));
        this.listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String str = (String) o.this.listView.getItemAtPosition(i);
                if (i == 0) {
                    o.this.startActivity(new Intent(o.this.getBaseContext(), o0.class));
                } else if (i == 1) {
                    o.this.startActivity(new Intent(o.this, o1.class));
                } else if (i == 2) {
                    o.this.startActivity(new Intent(o.this, o2.class));
                } else if (i == 3) {
                    o.this.startActivity(new Intent(o.this, o3.class));
                } else if (i == 4) {
                    o.this.startActivity(new Intent(o.this, o4.class));
                } else if (i == 5) {
                    o.this.startActivity(new Intent(o.this, o5.class));
                } else if (i == 6) {
                    o.this.startActivity(new Intent(o.this, o6.class));
                } else if (i == 7) {
                    o.this.startActivity(new Intent(o.this, o7.class));
                } else if (i == 8) {
                    o.this.startActivity(new Intent(o.this, o8.class));
                } else if (i == 9) {
                    o.this.startActivity(new Intent(o.this, o9.class));
                }
            }
        });
    }
}