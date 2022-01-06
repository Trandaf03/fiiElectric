package com.example.fielectric.masini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_masini_AvantajeVsDezavantaje extends AppCompatActivity {

    private TextView avantaj1;
    private TextView avantaj2;
    private TextView avantaj3;
    private TextView avantaj4;
    private TextView avantaj5;
    private TextView dezavantaj1;
    private TextView dezavantaj2;
    private TextView dezavantaj3;
    private TextView dezavantaj4;
    private TextView dezavantaj5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_masini_avantaje_dezavantaje);

        avantaj1 = (TextView) findViewById(R.id.masini_rabla_avantaje1);
        avantaj2 = (TextView) findViewById(R.id.masini_rabla_avantaje2);
        avantaj3 = (TextView) findViewById(R.id.masini_rabla_avantaje3);
        avantaj4 = (TextView) findViewById(R.id.masini_rabla_avantaje4);
        avantaj5 = (TextView) findViewById(R.id.masini_rabla_avantaje5);
        dezavantaj1 = (TextView) findViewById(R.id.masini_rabla_dezavantaje1);
        dezavantaj2 = (TextView) findViewById(R.id.masini_rabla_dezavantaje2);
        dezavantaj3 = (TextView) findViewById(R.id.masini_rabla_dezavantaje3);
        dezavantaj4 = (TextView) findViewById(R.id.masini_rabla_dezavantaje4);
        dezavantaj5 = (TextView) findViewById(R.id.masini_rabla_dezavantaje5);


        String textavantaj1 = "<b>✦ Costurile energiei electrice:</b> la momentul actual, mașinile electrice nu domină încă piața auto," +
                " prețurile pentru încărcare la diverse stații variind între 30 – 60 de lei, indiferent de cantitatea de curent consumată." +
                " Există și locații unde încărcarea este gratuită în anumite condiții." +
                "Încărcările rapide (~50 kwh) tind să fie o idee mai scumpe, însă diferența este neglijabilă," +
                " având în vedere că de aceeași sumă se pot achiziționa 5-10 litri de benzină/motorină," +
                " o cantitate care sigur nu vă asigură autonomia unui „plin” cu o mașină electrică.";
        String textavantaj2 ="<b>✦ Întreținere ieftină:</b> datorită faptului că autovehiculele electrice au mai puține piese în mișcare și anexe" +
                " față de echivalentele lor ce folosesc combustie internă (ICE), reviziile sunt mai ieftine. Astfel, puteți uita de" +
                " schimbul de ulei + filtre, antigel, bujii, kituri de distribuție și multe altele." +
                "De asemenea, mașinile electrice tind să conserve și viața plăcuțelor/discurilor de frână datorită" +
                " frânării regenerative. Desigur, automobilele electrice necesită o oarecare mentenanță, însă aceasta " +
                "va fi neglijabilă, mai ales dacă circulați mult (40-50.000km/an), costul acesteia amortizându-se cu economia de combustibil.";
        String textavantaj3 ="<b>✦ Contribuția la un viitor mai curat:</b> chiar dacă există anumite controverse legate de modalitatea de producție " +
                "a automobilelor electrice, un lucru este cert – acestea produc zero emisii poluante, un lucru demn de luat în seamă când" +
                " substanțele toxice din aerul respirat pot provoca diverse forme de cancer sau alte boli grave." +
                "Calitatea aerului din marile orașe ale lumii și chiar din țara noastră lasă mult de dorit, cu precădere la orele de" +
                " vârf, când mii de autoturisme cu motor termic emană vapori toxici. Pe măsură ce sistemele anti-poluare (catalizatoare" +
                ", filtre de particule Diesel) se încălzesc, efectul este oarecum redus, însă amprenta de carbon s-a format deja, iar rezultatele se vor vedea în timp." +
                "Un autovehicul electric folosește o resursă regenerabilă, în contrast cu motoarele termice. Având în vedere că " +
                "electricitatea se poate obține prin foarte multe metode, această sursă de energie se dovedește a fi mai sustenabilă și, " +
                "dacă este obținută prin mijloace eco-friendly, mult mai ecologică.";
        String textavantaj4 ="<b>✦ Mai puțină poluare fonică:</b> unii dintre noi sunt pasionați de „mormăitul” grav al unui motor Diesel sau de tonalitatea" +
                " dramatică a unui motor pe benzină, însă când acestea devin soundtrack-ul fiecărei dimineți de mers la muncă, pot deveni deranjante. " +
                "Dacă locuiți lângă o stradă aglomerată sau o șosea sau dacă pur și simplu nu sunteți fanul zgomotului tehnic, o mașină electrică " +
                "vă poate garanta călătorii silențioase și plăcute." +
                "Zgomotul emis de un astfel de vehicul este neglijabil, punându-se chiar problema siguranței pentru pietoni –" +
                " aceștia nu pot auzi în unele situații apropierea unei mașini electrice, existând posibilitatea unei situații periculoase." +
                "Din fericire, această problemă a fost rezolvată implementând diverse sisteme de city-safety, cu frânare automată la " +
                "detectarea obstacolelor sau chiar mici difuzoare ce simulează (silențios, de asemenea) sunetul unui motor în grila din față," +
                " activate la viteze reduse pentru a avertiza pietonii.";
        String textavantaj5 ="<b>✦ Reduceri de preț, taxe și cool-factor:</b> dacă decideți să achiziționați un autoturism electric nou, prin programul Rabla" +
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

        String textdezavantaj1 ="<b>✦ Prețul de achiziție:</b> fiind o tehnologie nouă și într-o continuă dezvoltare, prețurile mașinilor electrice tind să fie considerabil " +
                "mai mari, comparativ cu cele care folosesc carburanți convenționali." +
                "De exemplu, dacă o mașină din clasa compactă costă ~15.000 €, echivalentul ei electric poate ajunge și la 25.000-30.000€ (cu reducerea inclusă)," +
                " un preț care pentru majoritatea clienților este nejustificat. Astfel, se optează în general pentru autoturisme din clasa subcompactă, la" +
                " prețuri cuprinse între ~ 17.000-23.000€ (prin Rabla Plus), dar la acestea, pe lângă dezavantajele pe care clienții și le asumau deja," +
                " se adaugă și o lipsă de spațiu/confort interior." +
                "Chiar și aplicând reducerea Rabla Plus și potențialele promoții, mașinile electrice sunt mai scumpe și de obicei" +
                " acesta este motivul pentru care încă se achiziționează mașini cu motoare termice sau hibride.";
        String textdezavantaj2 ="<b>✦ Autonomia scăzută și timpul de încărcare:</b> am menționat mai devreme că tariful pentru un „plin” de " +
                "baterie este mult mai mic decât unul de combustibil fosil. Din nefericire, încărcarea unei mașini electrice va fi" +
                " mai frecventă, iar dacă vă doriți să obțineți un range cât mai mare, va trebui să renunțați adesea la sistemele " +
                "de climatizare, scaune încălzite sau alte dotări care vor consuma curent în exces." +
                "Călătoriile extraurbane necesită o planificare din timp, în funcție de disponibilitatea stațiilor de încărcare și," +
                " din nou, anumite dotări ale mașinii vor trebui folosite doar în cazuri de strictă necesitate dacă vă doriți să" +
                " obțineți acea economie de timp și bani. O încărcare rapidă durează, în general, 30 de minute, în contrast cu cele" +
                " 2-3 minute necesare alimentării (plus plății combustibilului) unei mașini cu motor termic." +
                "Hypermilingul (mersul la consum cât mai mic) poate fi la fel de stresant ca mersul în grabă, iar fenomenul de range " +
                "anxiety (sentimentul că veți rămâne în „pană de curent”) se va instala dacă nu vă folosiți corespunzător de mașină." +
                "Dacă nu vă doriți să aveți de a face cu acești termeni, iar condusul trebuie să fie o activitate cât mai relaxată și" +
                " confortabilă, autovehiculele electrice s-ar putea să nu fie cea mai bună opțiune.";
        String textdezavantaj3 ="<b>✦ Puține modele disponibile:</b> dacă ați răsfoit ofertele de autovehicule electrice " +
                "disponibile la ora actuală, ați aflat, probabil, că nu există prea multe opțiuni pe piață. Există, " +
                "într-o anumită măsură, o mașină electrică pentru oricine, dar dacă sunteți mai pretențioși și v-ați " +
                "dori un anume model, cel mai probabil va trebui să așteptați până când acesta va fi lansat de către producătorul respectiv.";
        String textdezavantaj4 ="<b>✦ Defecțiuni rare dar scumpe:</b> cea mai scumpă componentă a unei mașini electrice este bateria. " +
                "De obicei, clienții beneficiază de o garanție destul de generoasă de 8-10 ani, dar aceasta are un anumit cost" +
                " suplimentar. Cu precădere în cazul modelelor achiziționate second-hand, bateria poate fi uzată, iar " +
                "reparațiile pot ajunge să coste cât a costat mașina în sine." +
                "Acumulatorul unui autovehicul electric este format dintr-o serie de așa-numite „celule”, care în timp " +
                "se uzează la fel ca bateria unui smartphone. Aceste celule pot fi înlocuite nominal, însă chiar și această " +
                "operațiune necesită o manoperă consistentă, fiind o piesă greu accesibilă." +
                "Dacă optați pentru o mașină electrică second-hand, asigurați-vă că aceasta are o garanție valabilă pe " +
                "acumulator și că a fost bine întreținută – cu reviziile periodice efectuate la timp.";
        String textdezavantaj5 ="</b>✦ Stații de încărcare:</b> în prezent, țara noastră are aproximativ 400 de stații de încărcare pentru vehicule electrice" +
                " și, chiar dacă acest număr sună promițător, o bună parte dintre acestea au capacitatea de 1-2 mașini. Astfel, în eventualitatea" +
                " (improbabilă actualmente) în care numărul de mașini electrice ar crește semnificativ, șoferii ar avea dificultăți în a-și încărca autoturismele." +
                "Mai mult decât atât, numărul stațiilor de încărcare nu este distribuit uniform, unele județe având mai multe stații decât altele, făcând deținerea unei astfel de mașini mai facilă." +
                "Consultați starea infrastructurii de încărcare a vehiculelor electrice din orașul în care locuiți înainte de a lua " +
                "decizia achiziției. Dacă nu sunt destule stații sau distanțele sunt mari, alegerea unui autovehicul hibrid ar putea fi o alegere mai bună." +
                "În concluzie, automobilele electrice prezintă unele avantaje dacă dispuneți de bugetul necesar achiziției, însă va " +
                "trebui să aveți în vedere compromisurile deoarece acestea sunt destul de numeroase. Mașinile electrice vor evolua," +
                " în special la capitolul autonomie, însă, în prezent, pentru majoritatea clienților, dezavantajele tind să îndrepte" +
                " balanța către un autoturism cu combustie internă sau hibrid.";

        Spanned afisareTextdezAvantaj1 = Html.fromHtml(textdezavantaj1);
        Spanned afisareTextdezAvantaj2 = Html.fromHtml(textdezavantaj2);
        Spanned afisareTextdezAvantaj3 = Html.fromHtml(textdezavantaj3);
        Spanned afisareTextdezAvantaj4 = Html.fromHtml(textdezavantaj4);
        Spanned afisareTextdezAvantaj5 = Html.fromHtml(textdezavantaj5);

        dezavantaj1.setText(afisareTextdezAvantaj1);
        dezavantaj2.setText(afisareTextdezAvantaj2);
        dezavantaj3.setText(afisareTextdezAvantaj3);
        dezavantaj4.setText(afisareTextdezAvantaj4);
        dezavantaj5.setText(afisareTextdezAvantaj5);
    }
}