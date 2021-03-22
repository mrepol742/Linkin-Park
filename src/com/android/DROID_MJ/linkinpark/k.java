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

public class k extends Activity {
    ListView listView;

    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.f);
        }
        super.onCreate(bundle);
        setContentView(R.layout.c);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.listView = (ListView) findViewById(R.id.c);
        this.listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, new String[]{"Leave Out All The Rest", "What I've Done", "Wake", "Given Up", "Bleed It Out", "Shadow Of The Day", "Hands Held High", "No More Sorrow", " Valentine's Day", "In Between", "In Pieces", "The Little Things Give You Away"}));
        this.listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String str = (String) k.this.listView.getItemAtPosition(i);
                if (i == 0) {
                    k.this.startActivity(new Intent(k.this.getBaseContext(), k0.class));
                } else if (i == 1) {
                    k.this.startActivity(new Intent(k.this, k1.class));
                } else if (i == 2) {
                    k.this.startActivity(new Intent(k.this, k2.class));
                } else if (i == 3) {
                    k.this.startActivity(new Intent(k.this, k3.class));
                } else if (i == 4) {
                    k.this.startActivity(new Intent(k.this, k4.class));
                } else if (i == 5) {
                    k.this.startActivity(new Intent(k.this, k5.class));
                } else if (i == 6) {
                    k.this.startActivity(new Intent(k.this, k6.class));
                } else if (i == 7) {
                    k.this.startActivity(new Intent(k.this, k7.class));
                } else if (i == 8) {
                    k.this.startActivity(new Intent(k.this, k8.class));
                } else if (i == 9) {
                    k.this.startActivity(new Intent(k.this, k9.class));
                } else if (i == 10) {
                    k.this.startActivity(new Intent(k.this, k10.class));
                } else if (i == 11) {
                    k.this.startActivity(new Intent(k.this, k11.class));
                }
            }
        });
    }
}

