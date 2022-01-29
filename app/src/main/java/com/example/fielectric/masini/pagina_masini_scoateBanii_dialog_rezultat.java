package com.example.fielectric.masini;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public final class pagina_masini_scoateBanii_dialog_rezultat extends AppCompatDialogFragment {

    private String textAfisare;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Rezultat:")
                .setMessage(textAfisare)
                .setPositiveButton("Am înțeles", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
    }

    public void setTextAfisare(String text) {
        textAfisare = text;
    }


}
