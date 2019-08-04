package com.example.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private EditText jumlah;
    private Button btnhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.penjumlahan_bilangan);
        initUI();
        initEvent();
    }

    private void initEvent() {

    btnhasil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            hitungJumlah();
        }
    });
    }

    private void hitungJumlah() {
        int angka1 =Integer.parseInt(bil1.getText().toString());
        int angka2 =Integer.parseInt(bil2.getText().toString());
        int hasil =angka1+angka2;
        jumlah.setText(hasil+"");
    }

    private void initUI() {
    bil1 = (EditText) findViewById(R.id.txt1);
    bil2 = (EditText) findViewById(R.id.txt2);
    jumlah = (EditText) findViewById(R.id.txt_jumlah);
    btnhasil = (Button) findViewById(R.id.btn_jumlah);
    }
}