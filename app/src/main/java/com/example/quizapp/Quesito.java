package com.example.quizapp;

public class Quesito {
    private static int nextQuestionID = 0;
    private final int questionID;
    private String testo;
    private boolean risposta;
    private boolean userAnswer;
    private boolean given = false;
    private boolean hinted = false;

    public Quesito(String testo, boolean risposta) {
        this.testo = testo;
        this.risposta = risposta;
        questionID = nextQuestionID;
        nextQuestionID++;
    }

    public boolean getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(boolean userAnswer) {
        this.userAnswer = userAnswer;
    }

    public int getQuestionID() {
        return questionID;
    }

    public boolean isHinted() {
        return hinted;
    }

    public void setHinted(boolean hinted) {
        this.hinted = hinted;
    }

    public boolean isGiven() {
        return given;
    }

    public void setGiven(boolean given) {
        this.given = given;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public boolean getRisposta() {
        return risposta;
    }

    public void setRisposta(boolean risposta) {
        this.risposta = risposta;
    }
}
