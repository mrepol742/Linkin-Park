package com.android.DROID_MJ.linkinpark;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;

public class a extends Activity {
    private GridView c;
    private String[] d = new String[]{"Burn It Down", "Hybrid Theory", "Living Things", "Meteora", "Minutes To Midnight", "New Devide - EP", "Not Alone - Single", "One More Light", "A Thousand Suns", "Waiting For The End", "The Hunting Party", "Post Traumatic", "Recharged", "About"};
    private Integer[] e = new Integer[]{Integer.valueOf(R.drawable.b), Integer.valueOf(R.drawable.c), Integer.valueOf(R.drawable.d), Integer.valueOf(R.drawable.e), Integer.valueOf(R.drawable.f), Integer.valueOf(R.drawable.j), Integer.valueOf(R.drawable.h), Integer.valueOf(R.drawable.g), Integer.valueOf(R.drawable.a), Integer.valueOf(R.drawable.i), Integer.valueOf(R.drawable.s), Integer.valueOf(R.drawable.q), Integer.valueOf(R.drawable.x), Integer.valueOf(R.drawable.m)};
    private Intent f;
 
    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.g);
        }
        super.onCreate(bundle);
        setContentView(R.layout.a);
        a3();
        b bVar = new b(this, this.d, this.e);
        this.c = (GridView) findViewById(R.id.d);
   getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.c.setAdapter(bVar);
        this.c.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 0) {
                    a.this.startActivity(new Intent(a.this, d.class));
                } else if (i == 1) {
                    a.this.startActivity(new Intent(a.this, c.class));
                } else if (i == 2) {
                    a.this.startActivity(new Intent(a.this, j.class));
                } else if (i == 3) {
                    a.this.startActivity(new Intent(a.this, i.class));
                } else if (i == 4) {
                    a.this.startActivity(new Intent(a.this, k.class));
                } else if (i == 5) {
                    a.this.startActivity(new Intent(a.this, g.class));
                } else if (i == 6) {
                    a.this.startActivity(new Intent(a.this, f.class));
                } else if (i == 7) {
                    a.this.startActivity(new Intent(a.this, h.class));
                } else if (i == 8) {
                    a.this.startActivity(new Intent(a.this, l.class));
                } else if (i == 9) {
                    a.this.startActivity(new Intent(a.this, e.class));
                } else if (i == 10) {
                    a.this.startActivity(new Intent(a.this, n.class));
                } else if (i == 11) {
                    a.this.startActivity(new Intent(a.this, o.class));
                } else if (i == 12) {
                    a.this.startActivity(new Intent(a.this, p.class));
                } else if (i == 13) {
                    a.this.startActivity(new Intent(a.this, m.class));
                }
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.a, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.g:
                a1();
                return true;
            case R.id.r:
                startActivity(new Intent(this, q.class));
                return true;
            case R.id.m:
                a11();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
         }
    }

    private void a1() {
        this.f = getPackageManager().getLaunchIntentForPackage("com.maxmpz.audioplayer");
        if (this.f != null) {
            startActivity(this.f);
        } else {
        a2();
        }
    }

    private void a2() {
        this.f = getPackageManager().getLaunchIntentForPackage("com.android.music");
        if (this.f != null) {
            startActivity(this.f);
        }
    }

   private void a3() {
        if (getSharedPreferences("PREFERENCE", 0).getBoolean("isFirstRun", true)) {
            a4();
            a9();
            getSharedPreferences("PREFERENCE", 0).edit().putBoolean("isFirstRun", false).apply();
        }
    }

     private void a4() {
        new Builder(this).setIcon(R.mipmap.b).setTitle(R.string.f5).setMessage(R.string.f10).setCancelable(false).setPositiveButton(R.string.f6, new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                a5();
                a10();
            }
        }).setNegativeButton(R.string.f7, new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                a7();
            }
        }).show();
    }

     private void a5() {
        View inflate = getLayoutInflater().inflate(R.layout.b17, (ViewGroup) findViewById(R.id.j));
        ((TextView) inflate.findViewById(R.id.k)).setText(R.string.f8);
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(0);
        toast.setView(inflate);
        toast.show();
    }

   private void a6() {
        File file = new File(getCacheDir().getParent());
        if (file.exists()) {
            for (String str : file.list()) {
                if (!str.equals("lib")) {
                    deleteFile(new File(file, str));
                }
            }
        }
    }

    private boolean deleteFile(File file) {
        if (file == null) {
            return true;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        String[] list = file.list();
        boolean z = true;
        for (String file2 : list) {
            if (deleteFile(new File(file, file2)) && z) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private void a7() {
        a6();
        a.this.finishAffinity();
        a8();
    }

     private void a8() {
        View inflate = getLayoutInflater().inflate(R.layout.b17, (ViewGroup) findViewById(R.id.j));
        ((TextView) inflate.findViewById(R.id.k)).setText(R.string.f9);
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(0);
        toast.setView(inflate);
        toast.show();
    }

     private void a9() {
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra("duplicate", false);
        intent.putExtra("android.intent.extra.shortcut.NAME", getString(R.string.a));
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ShortcutIconResource.fromContext(getApplicationContext(), R.mipmap.b));
        intent.putExtra("android.intent.extra.shortcut.INTENT", new Intent(getApplicationContext(), a.class));
        sendBroadcast(intent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    private void a10() {
        new Builder(this).setMessage(R.string.f11).setCancelable(false).setPositiveButton(R.string.f12, new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show();
    }

    private void a11() {
        new Builder(this).setIcon(R.drawable.w).setTitle(R.string.f15).setMessage(R.string.f16).setCancelable(true).setPositiveButton(R.string.f18, new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
               a12();
            }
        }).setNegativeButton(R.string.f17, new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
               dialogInterface.dismiss();
            }
        }).show();
    }

    private void a12() {
    finishAffinity();
    }
}