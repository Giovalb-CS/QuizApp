package com.example.quizapp;

public class Quesito {
    private String testo;
    private boolean risposta;
    private boolean given = false;
    private boolean hinted = false;

    public Quesito(String testo, boolean risposta) {
        this.testo = testo;
        this.risposta = risposta;
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
