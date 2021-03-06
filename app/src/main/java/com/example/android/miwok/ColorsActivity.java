package com.example.android.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    private ArrayList<ColoresTraduccion> colores = new ArrayList<>();
    private MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        colores.add(new ColoresTraduccion("red", "rojillo", R.drawable.color_red, R.raw.color_red));

        colores.add(new ColoresTraduccion("gray", "griss", R.drawable.color_gray, R.raw.color_gray));

        colores.add(new ColoresTraduccion("green", "verdecillo", R.drawable.color_green, R.raw.color_green));

        colores.add(new ColoresTraduccion("black", "negrin", R.drawable.color_black, R.raw.color_black));

        colores.add(new ColoresTraduccion("dusty yellow", "amariyo paster", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));

        colores.add(new ColoresTraduccion("brown", "marroncin", R.drawable.color_brown, R.raw.color_brown));

        colores.add(new ColoresTraduccion("mustard yellow", "amarillon", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        media = media.create(this, R.raw.number_nine);

        AdapterColores adapter = new AdapterColores(this, colores);

        ListView lista = (ListView) findViewById(R.id.listacolores);

        lista.setAdapter(adapter);




    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("PAUSA","estas en pausa");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("STAR","estas en start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("STOP","te has parado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("DESTRUIDO","se ha destruido");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("RESUME","esta resumido");
    }
}
