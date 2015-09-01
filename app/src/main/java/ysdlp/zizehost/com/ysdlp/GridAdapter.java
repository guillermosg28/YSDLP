package ysdlp.zizehost.com.ysdlp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class GridAdapter extends BaseAdapter {

    private final Context mContext;
    private final Dato[] items;

    public GridAdapter(Context c, Dato[] items) {
        mContext = c;
        this.items = items;
    }

    @Override
    public int getCount() {
        // Decremento en 1, para no contar el header view - return items.length - 1;
        return items.length;
    }

    @Override
    public Dato getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        Dato item = getItem(position);

        // Seteando Imagen
        ImageView image = (ImageView) view.findViewById(R.id.imagen);
        Glide.with(image.getContext()).load(item.getIdThumbnail()).into(image);

        // Seteando Nombre
        TextView name = (TextView) view.findViewById(R.id.nombre);
        name.setText(item.getNombre());

        // Seteando Descripción
        TextView descripcion = (TextView) view.findViewById(R.id.descripcion);
        descripcion.setText(item.getDescripcion());

        // Seteando Fecha
        TextView precio = (TextView) view.findViewById(R.id.precio);
        precio.setText(item.getFecha());

        // Seteando Rating
        //RatingBar ratingBar = (RatingBar) view.findViewById(R.id.rating);
        //ratingBar.setRating(item.getRating());

        return view;
    }
}

