package com.example.android.miwok;

/**
 * Created by usuario on 26/10/17.
 */

public class NumerosTraduccion {

    private String miwok;
    private String ingles;

    public NumerosTraduccion(String miwok, String ingles) {
        this.miwok = miwok;
        this.ingles = ingles;
    }

    public String getMiwok() {
        return miwok;
    }

    public void setMiwok(String miwok) {
        this.miwok = miwok;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }


}
