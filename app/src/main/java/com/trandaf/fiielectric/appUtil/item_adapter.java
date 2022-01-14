package com.trandaf.fiielectric.appUtil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fielectric.R;

import java.util.List;

public class item_adapter extends RecyclerView.Adapter<item_adapter.ViewHolder> {
    private List<item_stire_data> listItems;
    private Context context;

    public item_adapter(List<item_stire_data> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_stire, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        item_stire_data listItem = listItems.get(position);

        holder.titlu.setText(listItem.getTitle());
        holder.descriere.setText(listItem.getDesc());
        holder.imagine.setImageResource(listItem.getImagine());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }





    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titlu;
        public TextView descriere;
        public ImageView imagine;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titlu = (TextView) itemView.findViewById(R.id.textview_titlu_stire);
            descriere = (TextView) itemView.findViewById(R.id.textview_descriere_stire);
            imagine = (ImageView) itemView.findViewById(R.id.imagine_stire);
        }
    }

}