package com.example.android.miwok;

/**
 * Created by usuario on 27/10/17.
 */

public class ColoresTraduccion {
    
    private String ingles;
    private String miwok;
    private int imagen;
    private int sonido;

    public ColoresTraduccion(String ingles, String miwok, int imagen, int sonido) {
        this.ingles = ingles;
        this.miwok = miwok;
        this.imagen = imagen;
        this.sonido = sonido;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getMiwok() {
        return miwok;
    }

    public void setMiwok(String miwok) {
        this.miwok = miwok;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getSonido() {
        return sonido;
    }

    public void setSonido(int sonido) {
        this.sonido = sonido;
    }
}
