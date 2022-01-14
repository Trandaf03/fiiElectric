package com.trandaf.fiielectric.masini;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class pagina_masini_scoateBanii_dialog_consumabile extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Consumabile")
                .setMessage("Vom considera consumabil doar schimbul uleiului de motor și a filtrului acestuia - principalul consumabil al mașinilor cu motor prin ardere internă." +
                        "\nAstfel, se va introduce prețul acestora la un schimb normal de ulei(de exemplu, schimbul costă 300lei), și se va considera că acesta se face la 10.000km")
                .setPositiveButton("Am înțeles", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
    }
}
