package com.example.fielectric.masini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_masini_dezavantaje extends AppCompatActivity {

    private TextView dezavantaj1;
    private TextView dezavantaj2;
    private TextView dezavantaj3;
    private TextView dezavantaj4;
    private TextView dezavantaj5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_masini_dezavantaje);

        dezavantaj1 = (TextView) findViewById(R.id.masini_rabla_dezavantaje1);
        dezavantaj2 = (TextView) findViewById(R.id.masini_rabla_dezavantaje2);
        dezavantaj3 = (TextView) findViewById(R.id.masini_rabla_dezavantaje3);
        dezavantaj4 = (TextView) findViewById(R.id.masini_rabla_dezavantaje4);
        dezavantaj5 = (TextView) findViewById(R.id.masini_rabla_dezavantaje5);

        String textdezavantaj1 = "<h1>✦ Prețul de achiziție:</h1><p> fiind o tehnologie nouă și într-o continuă dezvoltare, prețurile mașinilor electrice tind să fie considerabil " +
                "mai mari, comparativ cu cele care folosesc carburanți convenționali." +
                "De exemplu, dacă o mașină din clasa compactă costă ~15.000 €, echivalentul ei electric poate ajunge și la 25.000-30.000€ (cu reducerea inclusă)," +
                " un preț care pentru majoritatea clienților este nejustificat. Astfel, se optează în general pentru autoturisme din clasa subcompactă, la" +
                " prețuri cuprinse între ~ 17.000-23.000€ (prin Rabla Plus), dar la acestea, pe lângă dezavantajele pe care clienții și le asumau deja," +
                " se adaugă și o lipsă de spațiu/confort interior." +
                "Chiar și aplicând reducerea Rabla Plus și potențialele promoții, mașinile electrice sunt mai scumpe și de obicei" +
                " acesta este motivul pentru care încă se achiziționează mașini cu motoare termice sau hibride.</p>";
        String textdezavantaj2 = "<h1>✦ Autonomia scăzută și timpul de încărcare:</h1><p> am menționat mai devreme că tariful pentru un „plin” de " +
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
                " confortabilă, autovehiculele electrice s-ar putea să nu fie cea mai bună opțiune.</p>";
        String textdezavantaj3 = "<h1>✦ Puține modele disponibile:</h1><p> dacă ați răsfoit ofertele de autovehicule electrice " +
                "disponibile la ora actuală, ați aflat, probabil, că nu există prea multe opțiuni pe piață. Există, " +
                "într-o anumită măsură, o mașină electrică pentru oricine, dar dacă sunteți mai pretențioși și v-ați " +
                "dori un anume model, cel mai probabil va trebui să așteptați până când acesta va fi lansat de către producătorul respectiv.</p>";
        String textdezavantaj4 = "<h1>✦ Defecțiuni rare dar scumpe:</h1><p> cea mai scumpă componentă a unei mașini electrice este bateria. " +
                "De obicei, clienții beneficiază de o garanție destul de generoasă de 8-10 ani, dar aceasta are un anumit cost" +
                " suplimentar. Cu precădere în cazul modelelor achiziționate second-hand, bateria poate fi uzată, iar " +
                "reparațiile pot ajunge să coste cât a costat mașina în sine." +
                "Acumulatorul unui autovehicul electric este format dintr-o serie de așa-numite „celule”, care în timp " +
                "se uzează la fel ca bateria unui smartphone. Aceste celule pot fi înlocuite nominal, însă chiar și această " +
                "operațiune necesită o manoperă consistentă, fiind o piesă greu accesibilă." +
                "Dacă optați pentru o mașină electrică second-hand, asigurați-vă că aceasta are o garanție valabilă pe " +
                "acumulator și că a fost bine întreținută – cu reviziile periodice efectuate la timp.</p>";
        String textdezavantaj5 = "<h1>✦ Stații de încărcare:</h1><p> în prezent, țara noastră are aproximativ 400 de stații de încărcare pentru vehicule electrice" +
                " și, chiar dacă acest număr sună promițător, o bună parte dintre acestea au capacitatea de 1-2 mașini. Astfel, în eventualitatea" +
                " (improbabilă actualmente) în care numărul de mașini electrice ar crește semnificativ, șoferii ar avea dificultăți în a-și încărca autoturismele." +
                "Mai mult decât atât, numărul stațiilor de încărcare nu este distribuit uniform, unele județe având mai multe stații decât altele, făcând deținerea unei astfel de mașini mai facilă." +
                "Consultați starea infrastructurii de încărcare a vehiculelor electrice din orașul în care locuiți înainte de a lua " +
                "decizia achiziției. Dacă nu sunt destule stații sau distanțele sunt mari, alegerea unui autovehicul hibrid ar putea fi o alegere mai bună." +
                "În concluzie, automobilele electrice prezintă unele avantaje dacă dispuneți de bugetul necesar achiziției, însă va " +
                "trebui să aveți în vedere compromisurile deoarece acestea sunt destul de numeroase. Mașinile electrice vor evolua," +
                " în special la capitolul autonomie, însă, în prezent, pentru majoritatea clienților, dezavantajele tind să îndrepte" +
                " balanța către un autoturism cu combustie internă sau hibrid.</p>";
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