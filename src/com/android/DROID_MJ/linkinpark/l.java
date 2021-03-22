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

public class l extends Activity {
    ListView listView;

    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.f);
        }
        super.onCreate(bundle);
        setContentView(R.layout.c);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.listView = (ListView) findViewById(R.id.c);
        this.listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, new String[]{"Burning In The Skies", "The Catalyst", "Iridescent"}));
        this.listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String str = (String) l.this.listView.getItemAtPosition(i);
                if (i == 0) {
                    l.this.startActivity(new Intent(l.this.getBaseContext(), l0.class));
                } else if (i == 1) {
                    l.this.startActivity(new Intent(l.this, l1.class));
                } else if (i == 2) {
                    l.this.startActivity(new Intent(l.this, l2.class));
                }
            }
        });
    }
}

