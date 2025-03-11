package com.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PlanetAppAdapter extends BaseAdapter {
    private Context context;
    private String[] titles, subtitles;
    private int[] images;

    public PlanetAppAdapter(Context context, String[] titles, int[] images, String[] subtitles) {
        this.context = context;
        this.titles = titles;
        this.images = images;
        this.subtitles = subtitles;
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_planet, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.itemImage);
        TextView titleView = convertView.findViewById(R.id.tvTitle);
        TextView subtitleView = convertView.findViewById(R.id.tvSubtitle);

        imageView.setImageResource(images[position]);
        titleView.setText(titles[position]);
        subtitleView.setText(subtitles[position]);

        return convertView;
    }
}
