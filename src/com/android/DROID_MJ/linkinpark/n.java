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

public class n extends Activity {
    ListView listView;

    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.f);
        }
        super.onCreate(bundle);
        setContentView(R.layout.c);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.listView = (ListView) findViewById(R.id.c);
        this.listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, new String[]{"Final Masquerade"}));
        this.listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String str = (String) n.this.listView.getItemAtPosition(i);
                if (i == 0) {
                    n.this.startActivity(new Intent(n.this.getBaseContext(), n0.class));
                }
            }
        });
    }
}

