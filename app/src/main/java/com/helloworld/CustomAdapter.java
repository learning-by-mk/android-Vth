package com.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private String[] titles, subtitle1, subtitle2;
    private int[] images;

    public CustomAdapter(Context context, String[] titles, String[] subtitle1, String[] subtitle2, int[] images) {
        this.context = context;
        this.titles = titles;
        this.subtitle1 = subtitle1;
        this.subtitle2 = subtitle2;
        this.images = images;
    }
    @Override
    public int getCount() {
        return titles.length;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public Object getItem(int position) {
        return titles[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.itemImage);
        TextView titleView = convertView.findViewById(R.id.itemTitle);
        TextView subtitle1View = convertView.findViewById(R.id.itemSubtitle1);
        TextView subtitle2View = convertView.findViewById(R.id.itemSubtitle2);

        imageView.setImageResource(images[position]);
        titleView.setText(titles[position]);
        subtitle1View.setText(subtitle1[position]);
        subtitle2View.setText(subtitle2[position]);

        return convertView;
    }

}
