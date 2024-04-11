package com.example.formativa1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link spinFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class spinFragment extends Fragment {

    TextView selec_paises;
    Spinner paises_spin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_spin, container, false);
        selec_paises = view.findViewById(R.id.selec_paises);
        paises_spin = view.findViewById(R.id.paises_spin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireContext(), R.array.paises_array, android.R.layout.simple_spinner_item);
        paises_spin.setAdapter(adapter);
        return view;
    }
}