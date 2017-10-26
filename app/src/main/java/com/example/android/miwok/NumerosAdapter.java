package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by usuario on 26/10/17.
 */

public class NumerosAdapter extends ArrayAdapter<NumerosTraduccion> {


    public NumerosAdapter(NumbersActivity numbersActivity, int layout_lista_numeros, ArrayList<NumerosTraduccion> numeros) {
        super(numbersActivity,layout_lista_numeros,numeros);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_lista_numeros, parent, false);
        }


            NumerosTraduccion actual =  getItem(position);




        TextView miwok = (TextView) listItemView.findViewById(R.id.miwok);

        miwok.setText(actual.getMiwok());
        TextView ingles = (TextView) listItemView.findViewById(R.id.ingles);
        ingles.setText(actual.getIngles());

        return listItemView;

    }



}
