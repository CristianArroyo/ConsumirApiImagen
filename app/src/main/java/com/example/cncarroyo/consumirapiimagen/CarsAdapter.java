package com.example.cncarroyo.consumirapiimagen;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by cncarroyo on 20-05-2019.
 */

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.ViewHolder> {

     private ArrayList<CarsModel> carsModels = new ArrayList<>();
     private Context context;

     public CarsAdapter(Context context, ArrayList<CarsModel> carsModels){

         this.carsModels= carsModels;
         this.context = context;
     }


    @NonNull
    @Override
    public CarsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cars_list_item,parent,false);

        return new CarsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarsAdapter.ViewHolder holder, int position) {

        holder.tvModelo.setText(carsModels.get(position).getName());
        holder.tvDescripcion.setText(carsModels.get(position).getDesc());

        Picasso.get().load(carsModels.get(position).getImage()).into(holder.car_image);

    }

    @Override
    public int getItemCount() {
        return carsModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

         private ImageView car_image;
         private TextView tvModelo,tvDescripcion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            car_image=(ImageView) itemView.findViewById(R.id.Image_car);
            tvModelo=(TextView) itemView.findViewById(R.id.tvModelo);
            tvDescripcion=(TextView) itemView.findViewById(R.id.tvDescripcion);

        }
    }
}
