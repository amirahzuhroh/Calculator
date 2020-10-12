package com.example.tugas7teross;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AppSegitiga extends Fragment {

    EditText txtAlas, txtTinggi, txtSisiKa, txtSisiKi;
    TextView txtHasil, txtHasil2;
    Button btnHitung;
    View view;

    public AppSegitiga() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_app_segitiga, container, false);
        txtAlas = view.findViewById(R.id.txtAlas);
        txtTinggi = view.findViewById(R.id.txtTinggi);
        txtSisiKa = view.findViewById(R.id.txtSisiKa);
        txtSisiKi = view.findViewById(R.id.txtSisiKi);
        txtHasil = view.findViewById(R.id.txtHasil);
        txtHasil2 = view.findViewById(R.id.txtHasil2);
        btnHitung = view.findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, t, Ka, Ki, h, h2;
                a = Integer.parseInt(txtAlas.getText().toString());
                t = Integer.parseInt(txtTinggi.getText().toString());
                Ka = Integer.parseInt(txtSisiKa.getText().toString());
                Ki = Integer.parseInt(txtSisiKi.getText().toString());
                h = (a*t)/2;
                h2 = Ka+Ki+a;
                txtHasil.setText("Luas : " +h);
                txtHasil2.setText("Keliling : " +h2);
            }
        });

        return view;
    }
}