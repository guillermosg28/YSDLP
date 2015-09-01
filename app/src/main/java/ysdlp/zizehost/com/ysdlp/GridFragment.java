package ysdlp.zizehost.com.ysdlp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import in.srain.cube.views.GridViewWithHeaderAndFooter;

/**
 * Un fragmento que contiene una grilla de productos
 */
public class GridFragment extends Fragment {
    /**
     * Argumento que representa el número sección al que pertenece
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Creación prefabricada de un {@link GridFragment}
     */
    public static GridFragment newInstance(int sectionNumber) {
        GridFragment fragment = new GridFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public GridFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Obtención del grid view
        GridViewWithHeaderAndFooter grid =
                (GridViewWithHeaderAndFooter) rootView.findViewById(R.id.gridview);

        // Inicializar el grid view
        setUpGridView(grid);

        return rootView;
    }

    /**
     * Infla el grid view del fragmento dependiendo de la sección
     *
     * @param grid Instancia del grid view
     */
    private void setUpGridView(GridViewWithHeaderAndFooter grid) {
        int section_number = getArguments().getInt(ARG_SECTION_NUMBER);
        switch (section_number) {
            case 1:
                //grid.addHeaderView(createHeaderView(6, Products.getTelefonos()));
                grid.setAdapter(new GridAdapter(getActivity(), Datos.getNoticias()));
                break;
            case 2:
                grid.setAdapter(new GridAdapterEventos(getActivity(), Datos.getEventos()));
                break;
            case 3:
                grid.setAdapter(new GridAdapterEventos(getActivity(), Datos.getBuscame()));
                break;
        }
    }

    /**
     * Crea un view de cabecera para mostrarlo en el principio del grid view.
     *
     * @param position Posición del item que sera el grid view dentro de {@code items}
     * @param items    Array de datos
     * @return Header View
     */
    private View createHeaderView(int position, Dato[] items) {

        View view;

        LayoutInflater inflater = getActivity().getLayoutInflater();
        view = inflater.inflate(R.layout.grid_header, null, false);

        Dato item = items[position];

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
        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.rating);
        ratingBar.setRating(item.getRating());

        return view;
    }
}
