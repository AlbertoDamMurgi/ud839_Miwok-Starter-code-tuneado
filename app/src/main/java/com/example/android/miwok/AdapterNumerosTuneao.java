package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Farra on 26/10/2017.
 */

public class AdapterNumerosTuneao extends ArrayAdapter<NumerosTraduccion> {
    //El que va a inflar la vista
    private Context inflador;
    //los datos que va a manejar el adapter
    private ArrayList<NumerosTraduccion> datos;
    private MediaPlayer media;


    public AdapterNumerosTuneao(@NonNull Context inflador, @NonNull ArrayList<NumerosTraduccion> datos) {

        super(inflador, R.layout.layout_lista_numeros, datos);

        //inicializamos el inflador y los datos para poder acceder a ellos
        this.inflador = inflador;
        this.datos = datos;

    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //creamos a vista por la que entra por parametro
        View aux = convertView;
        //creamos el objeto de la clase que va a contener los elementos
        NumerosHolder holder;

        if(aux==null){
            //si la vista no existe, es decir si es null la inflamos
            aux=LayoutInflater.from(inflador).inflate(R.layout.layout_lista_numeros,null);
            //definimos el objeto holder
            holder = new NumerosHolder();

            //recogemos en el objeto los elementos de la vista
            holder.imagen = (ImageView) aux.findViewById(R.id.imagennum);
            holder.miwok=(TextView) aux.findViewById(R.id.miwokcolor);
            holder.ingles=(TextView) aux.findViewById(R.id.ingles);
            holder.sonido=(ImageView) aux.findViewById(R.id.imagenplay);

            //el metodo holder nos permite guardar cualquier objeto para rescatarlo despues.
            aux.setTag(holder);

        }
        //el metodo gettag devuelve un objeto de tipo object asi que hay que hacer el casting
        holder = (NumerosHolder) aux.getTag();

        //agregamos los datos a las views
        holder.imagen.setImageResource(datos.get(position).getImagenID());
        holder.ingles.setText(datos.get(position).getIngles());
        holder.miwok.setText(datos.get(position).getMiwok());





        holder.sonido.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                media = media.create(getContext(), datos.get(position).getSonido());


                if (media.isPlaying()) {

                    media.stop();

                }



                media.start();


            }
        });

        //
        //
        //todo esto lo hacemos para que si la vista ya esta inicializada, no volver a hacerlo
        //y que nuestro programa sea mucho mas eficiente

        //retornamos la vista



        return aux;

    }
}
