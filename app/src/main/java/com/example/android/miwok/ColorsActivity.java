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


        colores.add(new ColoresTraduccion("red","rojillo", Color.RED));
        colores.add(new ColoresTraduccion("blue","azulin",Color.BLUE));
        colores.add(new ColoresTraduccion("green","verdecillo",Color.GREEN));


        AdapterColores adapter = new AdapterColores(this,colores);

        ListView lista = (ListView) findViewById(R.id.listacolores);

        lista.setAdapter(adapter);





    }
}
