package com.example.quizapp;

import android.os.Bundle;
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
    }
}
