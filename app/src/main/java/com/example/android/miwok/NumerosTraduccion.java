package com.example.android.miwok;

import android.graphics.drawable.Drawable;

/**
 * Created by usuario on 26/10/17.
 */

public class NumerosTraduccion {

    private String miwok;
    private String ingles;
    private int imagenID;

    public NumerosTraduccion(String miwok, String ingles, int imagenID) {
        this.miwok = miwok;
        this.ingles = ingles;
        this.imagenID = imagenID;
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

    public int getImagenID() {
        return imagenID;
    }

    public void setImagenID(int imagenID) {
        this.imagenID = imagenID;
    }


}
