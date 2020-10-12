package com.example.tugas7teross;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AppKalkulator extends Fragment {

    EditText txtLayar;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnTambah, btnKurang, btnBagi, btnKali;
    Button btnClear, btnSamaDengan;
    View view;

    public static double nilaiSekarang = 0;
    public static String operasiSekarang = "";
    public static double hasil = 0.0;

    public AppKalkulator() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_app_kalkulator, container, false);

        txtLayar = view.findViewById(R.id.txtLayar);
        btn0 = view.findViewById(R.id.btn0);
        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);
        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        btn8 = view.findViewById(R.id.btn8);
        btn9 = view.findViewById(R.id.btn9);
        btnTambah = view.findViewById(R.id.btnTambah);
        btnKurang = view.findViewById(R.id.btnKurang);
        btnBagi = view.findViewById(R.id.btnBagi);
        btnKali = view.findViewById(R.id.btnKali);
        btnClear = view.findViewById(R.id.btnClear);
        btnSamaDengan = view.findViewById(R.id.btnSamaDengan);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText(txtLayar.getText().toString().trim() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText(txtLayar.getText().toString().trim() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText(txtLayar.getText().toString().trim() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText(txtLayar.getText().toString().trim() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText(txtLayar.getText().toString().trim() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText(txtLayar.getText().toString().trim() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText(txtLayar.getText().toString().trim() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText(txtLayar.getText().toString().trim() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText(txtLayar.getText().toString().trim() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText(txtLayar.getText().toString().trim() + "9");
            }
        });
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtLayar.getText().toString().trim().equals(""));
//                {
//                    Toast.makeText(AppKalkulator.this, "Angka Harus Diisi", Toast.LENGTH_SHORT).show();
//                    return;
//                }
                operasiSekarang = "tambah";
                nilaiSekarang = Double.parseDouble(txtLayar.getText().toString());
                txtLayar.setText("");
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtLayar.getText().toString().trim().equals(""));
//                {
//                    Toast.makeText(AppKalkulator.this, "Angka Harus Diisi", Toast.LENGTH_SHORT).show();
//                    return;
//                }
                operasiSekarang = "kurang";
                nilaiSekarang = Double.parseDouble(txtLayar.getText().toString());
                txtLayar.setText("");
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtLayar.getText().toString().trim().equals(""));
//                {
//                    Toast.makeText(AppKalkulator.this, "Angka Harus Diisi", Toast.LENGTH_SHORT).show();
//                    return;
//                }
                operasiSekarang = "bagi";
                nilaiSekarang = Double.parseDouble(txtLayar.getText().toString());
                txtLayar.setText("");
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtLayar.getText().toString().trim().equals(""));
//                {
//                    Toast.makeText(AppKalkulator.this, "Angka Harus Diisi", Toast.LENGTH_SHORT).show();
//                    return;
//                }
                operasiSekarang = "kali";
                nilaiSekarang = Double.parseDouble(txtLayar.getText().toString());
                txtLayar.setText("");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtLayar.setText("");
            }
        });
        btnSamaDengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operasiSekarang.equals("tambah")) {
                    hasil = nilaiSekarang + Double.parseDouble(txtLayar.getText().toString().trim());
                }
                if(operasiSekarang.equals("kurang")) {
                    hasil = nilaiSekarang - Double.parseDouble(txtLayar.getText().toString().trim());
                }
                if(operasiSekarang.equals("bagi")) {
                    hasil = nilaiSekarang / Double.parseDouble(txtLayar.getText().toString().trim());
                }
                if(operasiSekarang.equals("kali")) {
                    hasil = nilaiSekarang * Double.parseDouble(txtLayar.getText().toString().trim());
                }

                int nilaiTemp = (int) hasil;

                if(nilaiTemp == hasil) {
                    txtLayar.setText(String.valueOf((int)hasil));
                }else{
                    txtLayar.setText(String.valueOf(hasil));
                }
            }
        });

        return view;
    }
}