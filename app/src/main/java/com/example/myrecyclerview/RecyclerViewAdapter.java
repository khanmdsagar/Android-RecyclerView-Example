package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    String product_name[], product_price[];
    int product_image[];

    Context context;

    public RecyclerViewAdapter(Context ctx, String pro_name[], String pro_price[], int pro_img[]){
        context = ctx;
        product_name = pro_name;
        product_price = pro_price;
        product_image = pro_img;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.product_layout, parent, false);

        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.product_name.setText(product_name[position]);
        holder.product_price.setText(product_price[position]);
        holder.product_image.setImageResource(product_image[position]);

    }

    @Override
    public int getItemCount() {
        return product_name.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView  product_name;
        TextView  product_price;
        ImageView product_image;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            product_name = itemView.findViewById(R.id.product_name);
            product_price = itemView.findViewById(R.id.product_price);
            product_image = itemView.findViewById(R.id.product_image);
        }
    }
}
