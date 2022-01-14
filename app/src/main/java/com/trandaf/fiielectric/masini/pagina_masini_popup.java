package com.example.fiielectric.masini;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class pagina_masini_popup extends AppCompatDialogFragment {

    private String textAfisare;
    private String textTitlu;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(textTitlu)
                .setMessage(Html.fromHtml(textAfisare))
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

    public void setTextTitlu(String text) {
        textTitlu = text;
    }
}
