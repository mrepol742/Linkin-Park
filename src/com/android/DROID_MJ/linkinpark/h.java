package com.android.DROID_MJ.linkinpark;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.WindowManager;

public class h extends Activity {
    ListView listView;

    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.f);
        }
        super.onCreate(bundle);
        setContentView(R.layout.c);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.listView = (ListView) findViewById(R.id.c);
        this.listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, new String[]{"Nobody Can Save Me", "Good Goodbye", "Talking To Myself", "Battle Symphony", "Invisible", "Heavy", "Sorry For Now", "Halfway Right", "One More Light", "Sharp Edges"}));
        this.listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String str = (String) h.this.listView.getItemAtPosition(i);
                if (i == 0) {
                    h.this.startActivity(new Intent(h.this.getBaseContext(), h0.class));
                } else if (i == 1) {
                    h.this.startActivity(new Intent(h.this, h1.class));
                } else if (i == 2) {
                    h.this.startActivity(new Intent(h.this, h2.class));
                } else if (i == 3) {
                    h.this.startActivity(new Intent(h.this, h3.class));
                } else if (i == 4) {
                    h.this.startActivity(new Intent(h.this, h4.class));
                } else if (i == 5) {
                    h.this.startActivity(new Intent(h.this, h5.class));
                } else if (i == 6) {
                    h.this.startActivity(new Intent(h.this, h6.class));
                } else if (i == 7) {
                    h.this.startActivity(new Intent(h.this, h7.class));
                } else if (i == 8) {
                    h.this.startActivity(new Intent(h.this, h8.class));
                } else if (i == 9) {
                    h.this.startActivity(new Intent(h.this, h9.class));
                }
            }
        });
    }
}

