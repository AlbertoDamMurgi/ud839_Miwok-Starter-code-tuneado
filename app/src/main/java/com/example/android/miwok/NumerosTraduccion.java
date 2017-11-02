package com.example.android.miwok;

import android.graphics.drawable.Drawable;

/**
 * Created by usuario on 26/10/17.
 */

public class NumerosTraduccion {

    private String miwok;
    private String ingles;
    private int imagenID;
    private int sonido;

    public NumerosTraduccion(String miwok, String ingles, int imagenID, int sonido) {
        this.miwok = miwok;
        this.ingles = ingles;
        this.imagenID = imagenID;
        this.sonido = sonido;
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

    public int getSonido() {
        return sonido;
    }

    public void setSonido(int sonido) {
        this.sonido = sonido;
    }

}
