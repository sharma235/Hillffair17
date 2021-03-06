package com.nith.appteam.hillffair17.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nith.appteam.hillffair17.Models.HomeModel;
import com.nith.appteam.hillffair17.R;

import java.util.List;

/**
 * Created by aditya on 26/8/17.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.viewHolder> {

    private List<HomeModel> arrayList;
    private Context context;

    public HomeAdapter(List<HomeModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_home,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {

        HomeModel m=arrayList.get(position);
        holder.imageView.setImageResource(m.getPhoto_id());
        holder.textView.setText(m.getName());

        if(position==0)
            holder.cardView.setBackgroundColor(Color.rgb(255,205,210));
        else if(position==1)
            holder.cardView.setBackgroundColor(Color.rgb(157,255,164));
        else if(position==2)
            holder.cardView.setBackgroundColor(Color.rgb(209,196,233));
        else if(position==3)
            holder.cardView.setBackgroundColor(Color.rgb(187,222,251));
        else if(position==4)
            holder.cardView.setBackgroundColor(Color.rgb(255,204,128));
        else if(position==5)
            holder.cardView.setBackgroundColor(Color.rgb(255,245,157));
        else if(position==6)
            holder.cardView.setBackgroundColor(Color.rgb(248,187,208));
        else if(position==7)
            holder.cardView.setBackgroundColor(Color.rgb(198,193,250));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView imageView;
        TextView textView;
        public viewHolder(View itemView) {
            super(itemView);
            cardView= (CardView) itemView.findViewById(R.id.layout_card);
            imageView= (ImageView) itemView.findViewById(R.id.home_list_image);
            textView= (TextView) itemView.findViewById(R.id.home_text);
        }
    }
}