package com.example.quizapp;

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
    TextView TVRisposteCorretteNonValide;
    TextView TVRisposteCorrette;
    Quesito[] quesiti = {
            new Quesito("2 + 2 = 4", true),
            new Quesito("2 + 2 = 1", false),
            new Quesito("60 + 9 = 69", true),
            new Quesito("80 - 20 = 22", false)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TVnumero_quesito.findViewById(R.id.numero_quesito);
        TVquesito_testo.findViewById(R.id.quesito_testo);
        TVRisposteCorretteValide.findViewById(R.id.TVrisposteCorretteValide);
        TVRisposteCorretteNonValide.findViewById(R.id.TVrisposteCorretteNonValide);
        TVRisposteCorrette.findViewById(R.id.TVrisposteTotali);
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