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

public class p extends Activity {
    ListView listView;

    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.f);
        }
        super.onCreate(bundle);
        setContentView(R.layout.c);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.listView = (ListView) findViewById(R.id.c);
        this.listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, new String[]{"A Light That Never Comes (with Steve Aoki)", "Castle Of Glass (M. Shinoda Remix)", "Lost In The Echo (KillSonik Remix)", "Victimized (M. Shinoda Remix)", "l'll Be Gone (Vice Remix; featuring Pusha T)", "Lies Greed Misery (Dirtyphonics Remix)", "Roads Untraveled (Rad Omen Remix; featuring Bun B)", "Powerless (Enferno Remix)", "Burn It Down (Tom Swoon Remix)", " Until It Breaks (Datsik Remix)", "Skin To Bone (Nick Catchdubs Remix) (featuring Cody B. Ware and Ryu)", "l'll Be Gone (Schoolboy Remix)", "Until It Breaks (Money Mark Headphone Remix)", "A Light That Never Comes (Rick Rubin Remix)"}));
        this.listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String str = (String) p.this.listView.getItemAtPosition(i);
                if (i == 0) {
                    p.this.startActivity(new Intent(p.this.getBaseContext(), p0.class));
                } else if (i == 1) {
                    p.this.startActivity(new Intent(p.this, p1.class));
                } else if (i == 2) {
                    p.this.startActivity(new Intent(p.this, p2.class));
                } else if (i == 3) {
                    p.this.startActivity(new Intent(p.this, p3.class));
                } else if (i == 4) {
                    p.this.startActivity(new Intent(p.this, p4.class));
                } else if (i == 5) {
                    p.this.startActivity(new Intent(p.this, p5.class));
                } else if (i == 6) {
                    p.this.startActivity(new Intent(p.this, p6.class));
                } else if (i == 7) {
                    p.this.startActivity(new Intent(p.this, p7.class));
                } else if (i == 8) {
                    p.this.startActivity(new Intent(p.this, p8.class));
                } else if (i == 9) {
                    p.this.startActivity(new Intent(p.this, p9.class));
                } else if (i == 10) {
                    p.this.startActivity(new Intent(p.this, p10.class));
                } else if (i == 11) {
                    p.this.startActivity(new Intent(p.this, p11.class));
                } else if (i == 12) {
                    p.this.startActivity(new Intent(p.this, p12.class));
                } else if (i == 13) {
                    p.this.startActivity(new Intent(p.this, p13.class));
                }
            }
        });
    }
}