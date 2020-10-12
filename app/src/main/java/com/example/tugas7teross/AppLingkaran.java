package com.example.tugas7teross;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AppLingkaran extends Fragment {

    EditText txtJari;
    TextView txtHasil, txtHasil2;
    Button btnHitung;
    View view;

    public AppLingkaran() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_app_lingkaran, container, false);

        txtJari = view.findViewById(R.id.txtJari);
        txtHasil = view.findViewById(R.id.txtHasil);
        txtHasil2 = view.findViewById(R.id.txtHasil2);
        btnHitung = view.findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r = txtJari.getText().toString();
                if (r.length()!=0) {
                    String hL = luas(r);
                    String hK = keliling(r);
                    txtHasil.setText("Luas = " +hL+" m2");
                    txtHasil2.setText("Keliling = "+hK+" m");
//                }else {
//                    Toast.makeText(getApplicationContext(), "Wajib Diisi!", Toast.LENGTH_LONG).show();
                }
            }
        });
        
        return view;
    }

    private String keliling(String r) {
        Double dl = Double.parseDouble(r);
        Double hL = 2*3.14*dl;
        String sH = String.valueOf(hL);
        return sH;
    }

    private String luas(String r) {
        Double dl = Double.parseDouble(r);
        Double hL = 3.14*dl*dl;
        String sH = String.valueOf(hL);
        return sH;
    }
}