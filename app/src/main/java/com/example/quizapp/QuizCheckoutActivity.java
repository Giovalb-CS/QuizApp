package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizCheckoutActivity extends AppCompatActivity {

    private int risposteDateValide;
    private int risposteDateNonValide;
    private int risposteCorrette;

    TextView TVrisposteDateValide;
    TextView TVrisposteDateNonValide;
    TextView TVrisposteCorrette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizcheckout);

        risposteDateValide = getIntent().getIntExtra("risposteCorretteValide", 0);
        risposteDateNonValide = getIntent().getIntExtra("risposteCorretteNonValide", 0);
        risposteCorrette = getIntent().getIntExtra("risposteTotali", 0);

        TVrisposteDateValide = findViewById(R.id.risposteDateValide);
        TVrisposteDateNonValide = findViewById(R.id.risposteDateNonValide);
        TVrisposteCorrette = findViewById(R.id.risposteCorrette);

        TVrisposteDateValide.setText((CharSequence) (getText(R.string.risposteDateValide_it) + " " + risposteDateValide));
        TVrisposteDateNonValide.setText((CharSequence) (getText(R.string.risposteDateNonValide_it) + " " + risposteDateNonValide));
        TVrisposteCorrette.setText((CharSequence) (getText(R.string.risposteCorrette_it) + " " + risposteCorrette));
    }

    public void ripetiPremuto(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
