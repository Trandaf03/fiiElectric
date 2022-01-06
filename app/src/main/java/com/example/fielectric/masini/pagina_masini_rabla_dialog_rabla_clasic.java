package com.example.fielectric.masini;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class pagina_masini_rabla_dialog_rabla_clasic extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Rabla clasic")
                .setMessage("✦Acest program este destinat celor care doresc să își achiziționeze o nouă mașină și vor să o dea pe cea veche la schimb" +
                        "(doar dacă este înmatriculată în România înainte de 31dec 2013). Se beneficiază de:" +
                        "\n⋆un tichet în valuare de 7.500lei pentru achiziționarea unei mașini care emite mai puțin de 140g CO2/km" +
                        "\n⋆un eco-bonus de 1500lei pentru achiziționarea unei mașini care emite mai puțin de 105g CO2/km" +
                        "\n⋆un eco-bonus de 1500lei pentru achiziționarea unei mașini cu sistem GPL" +
                        "\n⋆un eco-bonus de 3000lei pentru achiziționarea unei mașini hibrid(fără plug-in)" +
                        "\n✦Tichetele sunt cumulabile, deci pentru achiziționarea unei mașini hibrid fără plug-in care " +
                        "emite sub 105g CO2/km suma totală acordată va fi de 12.000lei (" +
                        "7.500 lei prima de casare + 1.500 lei eco-bonus + 3.000 lei eco-bonus hibrid)")
                .setPositiveButton("Am înțeles", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
    }
}
