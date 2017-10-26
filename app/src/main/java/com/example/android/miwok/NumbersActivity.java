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




        numeros.add(new NumerosTraduccion("guan","one",R.drawable.numero1));
        numeros.add(new NumerosTraduccion("chu","two",R.drawable.numero2));
        numeros.add(new NumerosTraduccion("zrii","three",R.drawable.numero3));
        numeros.add(new NumerosTraduccion("for","four",R.drawable.numero4));
        numeros.add(new NumerosTraduccion("faif","five",R.drawable.numero5));
        numeros.add(new NumerosTraduccion("seih","six",R.drawable.numero6));
        numeros.add(new NumerosTraduccion("se-ben","seven",R.drawable.numero7));
        numeros.add(new NumerosTraduccion("eigg","eight",R.drawable.numero8));
        numeros.add(new NumerosTraduccion("nain","nine",R.drawable.numero9));
        numeros.add(new NumerosTraduccion("dieh","ten",R.drawable.numero10));





         //NumerosAdapter adaptador = new NumerosAdapter(this,R.layout.layout_lista_numeros,numeros);

            ListView lista = (ListView) findViewById(R.id.list);

            AdapterNumerosTuneao adapter = new AdapterNumerosTuneao(this,numeros);

            lista.setAdapter(adapter);

           // lista.setAdapter(adaptador);






    }
}
