package com.jtcode.tablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomFragment extends Fragment {

    public final static String KEY_REG_TEXT = "texto";



    public static Fragment newInstance(Bundle arguments) {
        CustomFragment frag = new CustomFragment();
        if (arguments != null)
            frag.setArguments(arguments);

        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflamos la Vista que se debe mostrar en pantalla.
        View rootView = inflater.inflate(R.layout.fragment_layout, container,
                false);
        // Creamos instancia del TextView.
        TextView tvText =  (TextView)rootView.findViewById(R.id.textView);
        // Recogemos el texto que guardamos al crear el Fragment.
        String text = getArguments().getString(KEY_REG_TEXT);
        // Mostramos el texto en el TextView.
        tvText.setText(text);

        // Devolvemos la vista para que se muestre en pantalla.
        return rootView;
    }
}
