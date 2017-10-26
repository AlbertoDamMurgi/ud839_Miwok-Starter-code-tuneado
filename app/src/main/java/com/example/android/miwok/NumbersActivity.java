package com.example.android.miwok;

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




        numeros.add(new NumerosTraduccion("guan","one"));
        numeros.add(new NumerosTraduccion("chu","two"));
        numeros.add(new NumerosTraduccion("zrii","three"));
        numeros.add(new NumerosTraduccion("for","four"));
        numeros.add(new NumerosTraduccion("faif","five"));
        numeros.add(new NumerosTraduccion("seih","six"));
        numeros.add(new NumerosTraduccion("se-ben","seven"));
        numeros.add(new NumerosTraduccion("eigg","eight"));
        numeros.add(new NumerosTraduccion("nain","nine"));
        numeros.add(new NumerosTraduccion("dieh","ten"));




         NumerosAdapter adaptador = new NumerosAdapter(this,R.layout.layout_lista_numeros,numeros);

            ListView lista = (ListView) findViewById(R.id.list);

            lista.setAdapter(adaptador);






    }
}
