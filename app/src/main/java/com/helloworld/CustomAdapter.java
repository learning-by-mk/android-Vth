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

    private int layout;

    public CustomAdapter(Context context, String[] titles, String[] subtitle1, String[] subtitle2, int[] images, int layout) {
        this.context = context;
        this.titles = titles;
        this.subtitle1 = subtitle1;
        this.subtitle2 = subtitle2;
        this.images = images;
        this.layout = layout;
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
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, parent, false);

            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.itemImage);
            holder.titleView = convertView.findViewById(R.id.itemTitle);
            holder.subtitle1View = convertView.findViewById(R.id.itemSubtitle1);
            holder.subtitle2View = convertView.findViewById(R.id.itemSubtitle2);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.imageView.setImageResource(images[position]);
        holder.titleView.setText(titles[position]);
        holder.subtitle1View.setText(subtitle1[position]);
        holder.subtitle2View.setText(subtitle2[position]);

        return convertView;
    }

    public class ViewHolder {
        ImageView imageView;
        TextView titleView;
        TextView subtitle1View;
        TextView subtitle2View;
    }
}
