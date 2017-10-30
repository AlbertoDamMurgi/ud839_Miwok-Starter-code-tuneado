package com.example.android.miwok;

import android.graphics.Color;
import android.provider.UserDictionary;
import android.support.annotation.DrawableRes;
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




        numeros.add(new NumerosTraduccion("guan","one", R.drawable.number_one));
        numeros.add(new NumerosTraduccion("chu","two",R.drawable.number_two));
        numeros.add(new NumerosTraduccion("zrii","three",R.drawable.number_three));
        numeros.add(new NumerosTraduccion("for","four",R.drawable.number_four));
        numeros.add(new NumerosTraduccion("faif","five",R.drawable.number_five));
        numeros.add(new NumerosTraduccion("seih","six",R.drawable.number_six));
        numeros.add(new NumerosTraduccion("se-ben","seven",R.drawable.number_seven));
        numeros.add(new NumerosTraduccion("eigg","eight",R.drawable.number_eight));
        numeros.add(new NumerosTraduccion("nain","nine",R.drawable.number_nine));

        numeros.add(new NumerosTraduccion("dieh","ten",R.drawable.number_ten));







         //NumerosAdapter adaptador = new NumerosAdapter(this,R.layout.layout_lista_numeros,numeros);

            ListView lista = (ListView) findViewById(R.id.list);

            AdapterNumerosTuneao adapter = new AdapterNumerosTuneao(this,numeros);

            lista.setAdapter(adapter);

         //lista.setAdapter(adaptador);






    }
}
