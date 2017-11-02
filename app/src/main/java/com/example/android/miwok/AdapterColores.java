package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by usuario on 27/10/17.
 */

public class AdapterColores extends ArrayAdapter<ColoresTraduccion>{

    private Context context;
    private ArrayList<ColoresTraduccion> datos;

    public AdapterColores(Context context, ArrayList<ColoresTraduccion> datos) {
        super(context,R.layout.layout_lista_colores,datos);
        this.context = context;
        this.datos = datos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View aux = convertView;
        Coloresholder holder;

        if(aux==null){

            aux= LayoutInflater.from(context).inflate(R.layout.layout_lista_colores,null);

            holder = new Coloresholder();

            holder.imagencolor=(ImageView) aux.findViewById(R.id.colorejemplo);
            holder.miwokcolor=(TextView) aux.findViewById(R.id.miwokcolor);
            holder.inglescolor=(TextView) aux.findViewById(R.id.inglescolor);

            aux.setTag(holder);

        }



        holder = (Coloresholder) aux.getTag();


        holder.imagencolor.setImageResource(datos.get(position).getImagen());

        //holder.imagencolor.setBackgroundColor(datos.get(position).getImagen());
       // holder.inglescolor.setTextColor(Color.WHITE);

        holder.inglescolor.setText(datos.get(position).getIngles());


        //holder.miwokcolor.setTextColor(datos.get(position).getImagen());


        holder.miwokcolor.setText(datos.get(position).getMiwok());
       // holder.miwokcolor.setTextColor(Color.WHITE);

        return aux;




    }
}
