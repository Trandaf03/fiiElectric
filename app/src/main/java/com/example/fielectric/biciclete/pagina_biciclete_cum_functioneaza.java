package com.example.fielectric.biciclete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.fielectric.R;

public final class pagina_biciclete_cum_functioneaza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_biciclete_cum_functioneaza);

        TextView text = (TextView) findViewById(R.id.biciclete_functioneaza);
        text.setText(Html.fromHtml(text_functioneaza));
    }
    private final String text_functioneaza = "<b>Din punct de vedere constructiv o bicicletă electrică functioneaza identic cu una clasică, diferență fiind prezența unui motor" +
            " electric amplasat în butucul din față sau din spate al cadrului și un acumulator LI-Ion reîncărcabil (șă de obicei detașabil pentru a putea fi luat în casă)" +
            " montat pe portbagaj sau undeva aproape de roata spate." +
            "<br><b><br>" +
            "<b>Un computer mai avansat sau mai rudimentar controlează modul în care funcționează motorul electric. Utilizatorul poate porni/opri acest motor în funcție" +
            " de dorința de a pedala singur sau a merge asistat de motorul electric." +
            "<br><b><br>" +
            "<b>În funcție de modelul bicicletei electrice vorbim de mod de lucru asistat simplu (pornit sau oprit), asistat complex (cu mal multi pași graduali " +
            "de dozare a efortului preluat de motorul electric) sau mod complet autonom prin care utilizatorul controlează viteza de deplasare a bicicletei prin" +
            " intermediul unui manșon ce poate fi rotit similar cu cel din ghidonul unei motociclete, fără a fi necesar să pedaleze în timpul mersului, cum se " +
            "întamplă în cazul modului asistat." +
            "<br><b><br>" +
            "<b>Bicicletele electrice de tipul asistat nu înlatură complet efortul depus de ciclist pentru a pedala, dar au avantajul unei autonomii " +
            "mai mare, deci reduc necesitatea încărcării dese a acestuia." +
            "<br><b><br>" +
            "<b>Foarte important de menționat este că bicicletele electrice sunt limitate în Uniunea Europeană la o putere maxim 250W (aproximativ 0.3 CP), adică " +
            "în practică sunt capabile să atingă o viteză maximă de aproximativ 25 km/oră în modul complet autonom. În funcție de model acestei caracteristici pot " +
            "varia semnificativ, bineînțeles." +
            "<br><b><br>" +
            "<b>Cel mal probabil această limitare vine pentru a permite persoanelor care utlizează biciclete electrice să le folosească fără a necesita un permis" +
            " de conducere special, care ar fi fost necesar în cazul unor motoare mai puternice." +
            "<br><b><br>" +
            "<b>Bicicletele electrice care depășesc constructiv viteze maxima de 25km/h sau sunt dotate cu motor mai puternic de 250W necesită carnet de conducere " +
            "categoria AM și trebuie înmatriculate, fiind încadrate în categoria mopedelor (putere sub 4kW și viteza maximă între 25 și 45 km/h)." +
            "<br><b><br>" +
            "<b>Autonomia acumulatorului va depinde de greutatea ciclistului, de viteza de deplasare, de vânt, gradul de înclinare al șoselei, însă în practică " +
            "te poți aștepta la 20-25 km de autonomie, existând și modele mai scumpe care urcă această valoare până la 100 km și chiar și mal mult." +
            " Odată descărcat acumulatorul se poate detașa de cadrul bicicletei pentru a putea fi încărcat direct de la prizele de apartament, fiindu-i necesare" +
            " în jur de 4-8 ore pentru a se încărca complet, deci de cele mal multe ori îl vei lăsa la încărcat peste noapte ca să il poți folosi a doua zi."
            + "<br>";
}