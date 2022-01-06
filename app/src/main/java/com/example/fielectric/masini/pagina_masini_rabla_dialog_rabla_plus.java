package com.example.fielectric.masini;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class pagina_masini_rabla_dialog_rabla_plus extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Rabla plus")
                .setMessage("✦Acest program este destinat celor care doresc să achiziționeze un vehicul 100% electric sau un vehicul plug-in hybrid." +
                        " ⋆Se oferă un eco-tichet în valuare de 20.000lei vehiculelor noi plug-in hybrid cu emisii de CO2 mai mici sau egale " +
                        "cu 50g/km în regim WLTP. " +
                        "\n⋆Se oferă un eco-tichet în valuare de 45.000lei vehiculelor 100% electrice." +
                        "\n⋆Tichetul Rabla Plus este cumulabil cu cel Rabla Clasic. De exemplu, la achiziționarea unei mașini 100% electrice " +
                        "suma totală de care poți beneficia este de 52.500lei (45.000lei + 7500lei prima de casare). ")
                .setPositiveButton("Am înțeles", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
    }
}
