package com.trandaf.fiielectric.masini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_masini_avantaje extends AppCompatActivity {

    private TextView avantaj1;
    private TextView avantaj2;
    private TextView avantaj3;
    private TextView avantaj4;
    private TextView avantaj5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_masini_avantaje_dezavantaje);

        avantaj1 = (TextView) findViewById(R.id.masini_rabla_avantaje1);
        avantaj2 = (TextView) findViewById(R.id.masini_rabla_avantaje2);
        avantaj3 = (TextView) findViewById(R.id.masini_rabla_avantaje3);
        avantaj4 = (TextView) findViewById(R.id.masini_rabla_avantaje4);
        avantaj5 = (TextView) findViewById(R.id.masini_rabla_avantaje5);


        String textavantaj1 = "<b>✦ Costurile energiei electrice:</b> la momentul actual, mașinile electrice nu domină încă piața auto," +
                " prețurile pentru încărcare la diverse stații variind între 30 – 60 de lei, indiferent de cantitatea de curent consumată." +
                " Există și locații unde încărcarea este gratuită în anumite condiții." +
                "Încărcările rapide (~50 kwh) tind să fie o idee mai scumpe, însă diferența este neglijabilă," +
                " având în vedere că de aceeași sumă se pot achiziționa 5-10 litri de benzină/motorină," +
                " o cantitate care sigur nu vă asigură autonomia unui „plin” cu o mașină electrică.";
        String textavantaj2 = "<b>✦ Întreținere ieftină:</b> datorită faptului că autovehiculele electrice au mai puține piese în mișcare și anexe" +
                " față de echivalentele lor ce folosesc combustie internă (ICE), reviziile sunt mai ieftine. Astfel, puteți uita de" +
                " schimbul de ulei + filtre, antigel, bujii, kituri de distribuție și multe altele." +
                "De asemenea, mașinile electrice tind să conserve și viața plăcuțelor/discurilor de frână datorită" +
                " frânării regenerative. Desigur, automobilele electrice necesită o oarecare mentenanță, însă aceasta " +
                "va fi neglijabilă, mai ales dacă circulați mult (40-50.000km/an), costul acesteia amortizându-se cu economia de combustibil.";
        String textavantaj3 = "<b>✦ Contribuția la un viitor mai curat:</b> chiar dacă există anumite controverse legate de modalitatea de producție " +
                "a automobilelor electrice, un lucru este cert – acestea produc zero emisii poluante, un lucru demn de luat în seamă când" +
                " substanțele toxice din aerul respirat pot provoca diverse forme de cancer sau alte boli grave." +
                "Calitatea aerului din marile orașe ale lumii și chiar din țara noastră lasă mult de dorit, cu precădere la orele de" +
                " vârf, când mii de autoturisme cu motor termic emană vapori toxici. Pe măsură ce sistemele anti-poluare (catalizatoare" +
                ", filtre de particule Diesel) se încălzesc, efectul este oarecum redus, însă amprenta de carbon s-a format deja, iar rezultatele se vor vedea în timp." +
                "Un autovehicul electric folosește o resursă regenerabilă, în contrast cu motoarele termice. Având în vedere că " +
                "electricitatea se poate obține prin foarte multe metode, această sursă de energie se dovedește a fi mai sustenabilă și, " +
                "dacă este obținută prin mijloace eco-friendly, mult mai ecologică.";
        String textavantaj4 = "<b>✦ Mai puțină poluare fonică:</b> unii dintre noi sunt pasionați de „mormăitul” grav al unui motor Diesel sau de tonalitatea" +
                " dramatică a unui motor pe benzină, însă când acestea devin soundtrack-ul fiecărei dimineți de mers la muncă, pot deveni deranjante. " +
                "Dacă locuiți lângă o stradă aglomerată sau o șosea sau dacă pur și simplu nu sunteți fanul zgomotului tehnic, o mașină electrică " +
                "vă poate garanta călătorii silențioase și plăcute." +
                "Zgomotul emis de un astfel de vehicul este neglijabil, punându-se chiar problema siguranței pentru pietoni –" +
                " aceștia nu pot auzi în unele situații apropierea unei mașini electrice, existând posibilitatea unei situații periculoase." +
                "Din fericire, această problemă a fost rezolvată implementând diverse sisteme de city-safety, cu frânare automată la " +
                "detectarea obstacolelor sau chiar mici difuzoare ce simulează (silențios, de asemenea) sunetul unui motor în grila din față," +
                " activate la viteze reduse pentru a avertiza pietonii.";
        String textavantaj5 = "<b>✦ Reduceri de preț, taxe și cool-factor:</b> dacă decideți să achiziționați un autoturism electric nou, prin programul Rabla" +
                " Plus veți primi o reducere de 45.000 de lei din prețul acestuia. În cazul modelelor plug-in hybrid, reducerea este de 20.000 de lei." +
                " Mai mult decât atât, autoturismele electrice sunt scutite de impozitul anual." +
                "În prezent, mașinile electrice reprezintă un procent mic din piața auto și astfel veți atrage mai multe priviri la volanul unui astfel" +
                " de automobil, mai ales datorită faptului că acestea tind să aibă un design mai nonconformist, cu unele excepții." +
                "Există în continuare numeroase idei preconcepute față de aceste mașini, cu precădere între persoanele mai conservatoare, dar dacă " +
                "vă doriți să ieșiți în evidență fără să cheltuiți mai mult de 20.000 €, autovehiculele electrice ar trebui să se afle printre opțiunile dumneavoastră.";

        Spanned afisareTextAvantaj1 = Html.fromHtml(textavantaj1);
        Spanned afisareTextAvantaj2 = Html.fromHtml(textavantaj2);
        Spanned afisareTextAvantaj3 = Html.fromHtml(textavantaj3);
        Spanned afisareTextAvantaj4 = Html.fromHtml(textavantaj4);
        Spanned afisareTextAvantaj5 = Html.fromHtml(textavantaj5);

        avantaj1.setText(afisareTextAvantaj1);
        avantaj2.setText(afisareTextAvantaj2);
        avantaj3.setText(afisareTextAvantaj3);
        avantaj4.setText(afisareTextAvantaj4);
        avantaj5.setText(afisareTextAvantaj5);


    }
}