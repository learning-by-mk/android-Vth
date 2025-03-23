package com.helloworld.th4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.helloworld.CustomRecyclerAdapter;
import com.helloworld.R;

public class CustomerAdapterVertical extends RecyclerView.Adapter<CustomerAdapterVertical.ViewHolder> {

    private Context context;
    private int[] images;
    private String[] titles;

    public CustomerAdapterVertical(Context context, int[] images, String[] titles) {
        this.context = context;
        this.images = images;
        this.titles = titles;
    }

    @NonNull
    @Override
    public CustomerAdapterVertical.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item_recycle_vertical, parent, false);
        return new CustomerAdapterVertical.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerAdapterVertical.ViewHolder holder, int position) {
        holder.imgView.setImageResource(images[position]);
        holder.tv.setText(titles[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView;
        TextView tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.civ);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
