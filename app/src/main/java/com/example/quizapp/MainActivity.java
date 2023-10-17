package com.example.quizapp;

import androidx.annotation.StringDef;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView TVnumero_quesito;
    TextView TVquesito_testo;
    TextView TVRisposteCorretteValide;
    private int risposteCorretteValide;
    TextView TVRisposteCorretteNonValide;
    private int risposteCorretteNonValide;
    TextView TVRisposteCorrette;
    private int risposteCorrette;
    ArrayList<Quesito> quesiti = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TVnumero_quesito = findViewById(R.id.numero_quesito);
        TVquesito_testo = findViewById(R.id.quesito_testo);
        TVRisposteCorretteValide = findViewById(R.id.TVrisposteCorretteValide);
        TVRisposteCorretteNonValide = findViewById(R.id.TVrisposteCorretteNonValide);
        TVRisposteCorrette = findViewById(R.id.TVrisposteTotali);

        quesiti.add(new Quesito("Il gatto appartiene alla famiglia dei felini?", true));
        quesiti.add(new Quesito("Il felino più veloce del mondo è la lince?", false));
        quesiti.add(new Quesito("Il motore di ricerca più famoso è Google?", true));
        quesiti.add(new Quesito("L'intelligenza artificiale basata su reti neurali più famosa è ChatGPT di OpenAI?", true));
        quesiti.add(new Quesito("NVIDIA è un'azienda che produce GPU?", true));
        quesiti.add(new Quesito("Intel ha di recente lanciato sul mercato una serie di GPU chiamata Ark?", true));
        quesiti.add(new Quesito("MIUI è il SO degli smartphone prodotti da Xiaomi?", true));
        quesiti.add(new Quesito("Steve Wozniak è il fondatore di Android?", false));

        startQuiz();
    }

    private void startQuiz(){
        Quesito quesitoAttuale = quesiti.get(0);
        TVnumero_quesito.setText(R.string.quesito_numero_it + " " + (quesitoAttuale.getQuestionID()+1));
        TVquesito_testo.setText("Domanda: " + quesitoAttuale.getTesto());
        risposteCorretteValide = 0;
        risposteCorretteNonValide = 0;
        risposteCorrette = 0;
        TVRisposteCorretteValide.setText(R.string.rispostecorrettevalide_it + " " + risposteCorretteValide);
        TVRisposteCorretteNonValide.setText(R.string.rispostecorrettenonvalide_it + " " + risposteCorretteNonValide);
        TVRisposteCorrette.setText(R.string.rispostetotali_it + " " + risposteCorrette);
    }

    public void precedentePremuto(View view){

    }

    public void veroPremuto(View view){

    }

    public void falsoPremuto(View view){

    }

    public void successivoPremuto(View view){

    }

    public void suggerimentoPremuto(View view){
        /*
        new Intent i = new Intent();
        i.setClass(getApplicationContext(), Suggerimento.class);
        i.putExtra("TESTO", arrayDomande[domandaCorrente].getTesto());
        i.putExtra("RISPOSTA", arrayDomande[domandaCorrente].getRisposta());
        startActivityForResult(i, 897);
        */
    }

}