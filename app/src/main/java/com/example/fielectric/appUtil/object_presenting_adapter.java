package com.example.fielectric.appUtil;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fielectric.R;
import com.example.fielectric.app_related.pagina_contact;
import com.example.fielectric.informatii.motociclete_info;

import java.util.List;

public class object_presenting_adapter extends RecyclerView.Adapter<object_presenting_adapter.ViewHolder> {

    private List<object_presenting_item_data> listItems;
    private Context context;


    public object_presenting_adapter(List<object_presenting_item_data> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_object, parent, false);
        return new object_presenting_adapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        object_presenting_item_data listItem = listItems.get(position);

        holder.titlu.setText(listItem.getTitle());
        holder.imagine.setImageResource(listItem.getImagine());
        holder.imagine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.activity_object_created_file, null);

                TextView title = (TextView) layout.findViewById(R.id.textview_titlu_object_created);
                TextView text = (TextView) layout.findViewById(R.id.textview_text_object_created);

                title.setText(listItem.getTitle());
                text.setText(Html.fromHtml(listItem.getText()));

                AlertDialog.Builder alertbox = new AlertDialog.Builder(v.getRootView().getContext());
                alertbox.setMessage(listItem.getTitle());
                alertbox.setView(layout);
                alertbox.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });
                alertbox.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView titlu;
        public ImageButton imagine;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titlu = (TextView) itemView.findViewById(R.id.textview_titlu_object);
            imagine = (ImageButton) itemView.findViewById(R.id.imagine_object);
        }

    }


}
