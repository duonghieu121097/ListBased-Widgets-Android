package com.example.dell.tuan04;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomIconLabelAdapter extends ArrayAdapter<String> {
    Context context;

    Integer[] thumbnails;
    String[] items;

    public CustomIconLabelAdapter(Context context, int layoutToBeInflated, String[] items, Integer[] thumbnails) {
        super(context, R.layout.activity_custom_icon_label_adapter, items);
        this.context = context;
        this.thumbnails = thumbnails;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.activity_custom_icon_label_adapter, null);
        TextView label = (TextView) row.findViewById(R.id.textView2);
        ImageView icon = (ImageView) row.findViewById(R.id.imageView);
        ImageView icon1 = (ImageView) row.findViewById(R.id.imageView4);
        label.setText(items[position]);
        icon.setImageResource(thumbnails[position]);
        icon1.setImageResource(thumbnails[position]);

        return (row);
    }
}
