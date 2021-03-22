package com.android.DROID_MJ.linkinpark;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.view.WindowManager;
import android.widget.ListView;

public class c extends Activity {
    ListView listView;

    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.f);
        }
        super.onCreate(bundle);
        setContentView(R.layout.c);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.listView = (ListView) findViewById(R.id.c);
        this.listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, new String[]{"One Step Closer", "With You", "Points Of Authority", "Crawling", "Runaway", "Be Myself", "Forgotten", "Cure of The Itch", "Pushing Me Away", "Papercut", "In The End", "A Place For My Head"}));
        this.listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String str = (String) c.this.listView.getItemAtPosition(i);
                if (i == 0) {
                    c.this.startActivity(new Intent(c.this.getBaseContext(), c0.class));
                } else if (i == 1) {
                    c.this.startActivity(new Intent(c.this, c1.class));
                } else if (i == 2) {
                    c.this.startActivity(new Intent(c.this, c2.class));
                } else if (i == 3) {
                    c.this.startActivity(new Intent(c.this, c3.class));
                } else if (i == 4) {
                    c.this.startActivity(new Intent(c.this, c4.class));
                } else if (i == 5) {
                    c.this.startActivity(new Intent(c.this, c5.class));
                } else if (i == 6) {
                    c.this.startActivity(new Intent(c.this, c6.class));
                } else if (i == 7) {
                    c.this.startActivity(new Intent(c.this, c7.class));
                } else if (i == 8) {
                    c.this.startActivity(new Intent(c.this, c8.class));
                } else if (i == 9) {
                    c.this.startActivity(new Intent(c.this, c9.class));
                } else if (i == 10) {
                    c.this.startActivity(new Intent(c.this, c10.class));
                } else if (i == 11) {
                    c.this.startActivity(new Intent(c.this, c11.class));
                }
            }
        });
    }
}

