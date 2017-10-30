package com.example.android.miwok;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

     ArrayList<ColoresTraduccion> colores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        colores.add(new ColoresTraduccion("red","rojillo", R.drawable.color_red));
        colores.add(new ColoresTraduccion("gray","griss",R.drawable.color_gray));
        colores.add(new ColoresTraduccion("green","verdecillo",R.drawable.color_green));
        colores.add(new ColoresTraduccion("black","negrin",R.drawable.color_black));
        colores.add(new ColoresTraduccion("dusty yellow","amariyo paster",R.drawable.color_dusty_yellow));

        colores.add(new ColoresTraduccion("brown","marroncin",R.drawable.color_brown));
        colores.add(new ColoresTraduccion("mustard yellow","amarillon",R.drawable.color_mustard_yellow));

        AdapterColores adapter = new AdapterColores(this,colores);

        ListView lista = (ListView) findViewById(R.id.listacolores);

        lista.setAdapter(adapter);





    }
}
