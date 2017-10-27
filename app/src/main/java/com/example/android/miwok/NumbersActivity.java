package com.example.android.miwok;

import android.graphics.Color;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    ArrayList<NumerosTraduccion> numeros = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);




        numeros.add(new NumerosTraduccion("guan","one", Color.RED));
        numeros.add(new NumerosTraduccion("chu","two",Color.RED));
        numeros.add(new NumerosTraduccion("zrii","three",Color.RED));
        numeros.add(new NumerosTraduccion("for","four",Color.RED));
        numeros.add(new NumerosTraduccion("faif","five",Color.RED));
        numeros.add(new NumerosTraduccion("seih","six",Color.RED));
        numeros.add(new NumerosTraduccion("se-ben","seven",Color.RED));
        numeros.add(new NumerosTraduccion("eigg","eight",Color.RED));
        numeros.add(new NumerosTraduccion("nain","nine",Color.RED));

        numeros.add(new NumerosTraduccion("dieh","ten",Color.RED));







         NumerosAdapter adaptador = new NumerosAdapter(this,R.layout.layout_lista_numeros,numeros);

            ListView lista = (ListView) findViewById(R.id.list);

            //AdapterNumerosTuneao adapter = new AdapterNumerosTuneao(this,numeros);

            //lista.setAdapter(adapter);

         lista.setAdapter(adaptador);






    }
}
