package com.example.fielectric.informatii;

import com.example.fielectric.R;

import java.util.ArrayList;
import java.util.List;

public class motociclete_info {


    List<motociclete> motoLIst;

    public motociclete_info() {
        motoLIst = new ArrayList<>();

        motoLIst.add(ZeroSRF);
        motoLIst.add(ZeroSRS);
        motoLIst.add(ZeroDSR);
        motoLIst.add(ZeroS);
        motoLIst.add(ZeroFX);
        motoLIst.add(ZeroSR);
        motoLIst.add(HorwinCR6PRO);
        motoLIst.add(HorwinCR6);
        motoLIst.add(SuperSocoTCmax);

        motoLIst.add(HorwinEK3deluxe2baterii);
        motoLIst.add(HorwinEK3deluxe);
        motoLIst.add(HorwinEK32baterii);
        motoLIst.add(HorwinEK3);
        motoLIst.add(SuperSocoCPx);
    }


    public List<motociclete> returnMoto() {
        return motoLIst;
    }

    public int motoSize() {
        return motoLIst.size();
    }

    public motociclete ZeroSRF = new motociclete("Zero SR/F", "14,4 kWh", "4h", "175KM", "82 kW", "€23.636", R.drawable.motociclete_zerosrf);
    public motociclete ZeroSRS = new motociclete("Zero SR/S", "14,4 kWh", "4h", "175KM", "81 kW", "€24.792", R.drawable.motociclete_zerosrs);
    public motociclete ZeroDSR = new motociclete("Zero DSR", "14,4 kWh", "4h", "169KM", "52 kW", "€18.640", R.drawable.motociclete_zerodsr);
    public motociclete ZeroS = new motociclete("Zero S", "11 kWh", "6h", "217KM", "44 kW", "€17.140", R.drawable.motociclete_zeros);
    public motociclete ZeroFX = new motociclete("Zero FX", "7.2 kWh", "10h", "87KM", "33 kW", "€13.515", R.drawable.motociclete_zerofx);
    public motociclete ZeroSR = new motociclete("Zero SR", "14,4 kWh", "3h", "230KM", "52 kW", "€18.640", R.drawable.motociclete_zerosr);
    public motociclete HorwinCR6PRO = new motociclete("Horwin CR6 PRO", "4.32 kWh", "3h", "142KM", "11 kW", "€7.590", R.drawable.motociclete_horwincr6pro);
    public motociclete HorwinCR6 = new motociclete("Horwin CR6", "3.96 kWh", "3h", "120KM", "7.2 kW", "€6.390", R.drawable.motociclete_horwincr6);
    public motociclete SuperSocoTCmax = new motociclete("Super Soco TCmax", "3.24 kWh", "3h", "100KM", "5 kW", "€4.890", R.drawable.motociclete_supertcmax);


    public motociclete HorwinEK3deluxe2baterii = new motociclete("Horwin EK3 Deluxe (două baterii)", "5.76 kWh", "5h", "200km", "7,2kW", "€6.190", R.drawable.motociclete_horwinscuter);
    public motociclete HorwinEK32baterii = new motociclete("Horwin EK3 (două baterii)", "5.76 kW", "5h", "200KM", "7,2 kW", "€5.990", R.drawable.motociclete_horwinscuter);
    public motociclete HorwinEK3deluxe = new motociclete("Horwin EK3 deluxe", "2.88 kWh", "4h", "100KM", "7,2 kW", "€5.090", R.drawable.motociclete_horwinscuter);
    public motociclete HorwinEK3 = new motociclete("Horwin EK3", "2.88 kWh", "4h", "100KM", "5.76 kW", "€4.890", R.drawable.motociclete_horwinscuter);
    public motociclete SuperSocoCPx = new motociclete("Super Soco CPx", "2.7 kWh", "4h", "140KM", "5 kW", "€4.990", R.drawable.motociclete_supersococpx);

    public String getName(motociclete moto) {
        return moto.nume;
    }

    public int getImage(motociclete moto) {
        return moto.imagine;
    }

}
