package com.android.DROID_MJ.linkinpark;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class b extends ArrayAdapter<String> {
    private final Context context;
    private final String[] items;
    private final Integer[] logo;

    public b(Context context, String[] strArr, Integer[] numArr) {
        super(context, R.layout.b, strArr);
        this.context = context;
        this.items = strArr;
        this.logo = numArr;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.b, null, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.a);
        ((TextView) inflate.findViewById(R.id.b)).setText(this.items[i]);
        imageView.setImageResource(this.logo[i].intValue());
        return inflate;
    }
}