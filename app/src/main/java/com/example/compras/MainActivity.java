package com.example.compras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.compras.utils.AppConstants;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    public TextView cajaValor1, cajaValor2, cajaValor3, cajaValor4, cajaValor5, cajaValor6, cajaValor7, cajaValor8, cajaValor9;
    public LinearLayout layoutUno, layoutDos, layoutTres, layoutCuatro, layoutCinco, layoutSeis, layoutSiete, layoutOcho, layoutNueve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaValor1 = findViewById(R.id.valor1);
        cajaValor2 = findViewById(R.id.valor2);
        cajaValor3 = findViewById(R.id.valor3);
        cajaValor4 = findViewById(R.id.valor4);
        cajaValor5 = findViewById(R.id.valor5);
        cajaValor6 = findViewById(R.id.valor6);
        cajaValor7 = findViewById(R.id.valor7);
        cajaValor8 = findViewById(R.id.valor8);
        cajaValor9 = findViewById(R.id.valor9);

        layoutUno = findViewById(R.id.linearUno);
        layoutDos = findViewById(R.id.linearDos);
        layoutTres = findViewById(R.id.linearTres);
        layoutCuatro = findViewById(R.id.linearCuatro);
        layoutCinco = findViewById(R.id.linearCinco);
        layoutSeis = findViewById(R.id.linearSeis);
        layoutSiete = findViewById(R.id.linearSiete);
        layoutOcho = findViewById(R.id.linearOcho);
        layoutNueve = findViewById(R.id.linearNueve);

        final EditText exportarUser = (EditText) findViewById(R.id.get_user),
                exportarEmail = (EditText) findViewById(R.id.get_email);

        Button btn = (Button) findViewById(R.id.btn_enviar);

        AtomicInteger var1 = new AtomicInteger();
        AtomicInteger var2 = new AtomicInteger();
        AtomicInteger var3 = new AtomicInteger();
        AtomicInteger var4 = new AtomicInteger();
        AtomicInteger var5 = new AtomicInteger();
        AtomicInteger var6 = new AtomicInteger();
        AtomicInteger var7 = new AtomicInteger();
        AtomicInteger var8 = new AtomicInteger();
        AtomicInteger var9 = new AtomicInteger();
        AtomicInteger total = new AtomicInteger();

        layoutUno.setOnClickListener(v ->{
            var1.set(Integer.parseInt(cajaValor1.getText().toString())+1);
            cajaValor1.setText(String.valueOf(var1));
            total.set(total.get()+var1.get());
        });

        layoutDos.setOnClickListener(v ->{
            var2.set(Integer.parseInt(cajaValor2.getText().toString())+1);
            cajaValor2.setText(String.valueOf(var2));
            total.set(total.get()+var2.get());
        });

        layoutTres.setOnClickListener(v ->{
            var3.set(Integer.parseInt(cajaValor3.getText().toString())+1);
            cajaValor3.setText(String.valueOf(var3));
            total.set(total.get()+var3.get());
        });

        layoutCuatro.setOnClickListener(v ->{
            var4.set(Integer.parseInt(cajaValor4.getText().toString())+1);
            cajaValor4.setText(String.valueOf(var4));
            total.set(total.get()+var4.get());
        });

        layoutCinco.setOnClickListener(v ->{
            var5.set(Integer.parseInt(cajaValor5.getText().toString())+1);
            cajaValor5.setText(String.valueOf(var5));
            total.set(total.get()+var5.get());
        });

        layoutSeis.setOnClickListener(v ->{
            var6.set(Integer.parseInt(cajaValor6.getText().toString())+1);
            cajaValor6.setText(String.valueOf(var6));
            total.set(total.get()+var6.get());
        });

        layoutSiete.setOnClickListener(v ->{
            var7.set(Integer.parseInt(cajaValor7.getText().toString())+1);
            cajaValor7.setText(String.valueOf(var7));
            total.set(total.get()+var7.get());
        });

        layoutOcho.setOnClickListener(v ->{
            var8.set(Integer.parseInt(cajaValor8.getText().toString())+1);
            cajaValor8.setText(String.valueOf(var8));
            total.set(total.get()+var8.get());
        });

        layoutNueve.setOnClickListener(v ->{
            var9.set(Integer.parseInt(cajaValor9.getText().toString())+1);
            cajaValor9.setText(String.valueOf(var9));
            total.set(total.get()+var9.get());
        });

        btn.setOnClickListener(v -> {
            Intent intento1 = new Intent(MainActivity.this, NewActivity.class);
            String nickname = exportarUser.getText().toString();
            String correo = exportarEmail.getText().toString();

            intento1.putExtra(AppConstants.TEXT_KEY, nickname);
            intento1.putExtra(AppConstants.TEXT_KEY_TWO, correo);

            intento1.putExtra("pro1", String.valueOf(var1.get()));
            intento1.putExtra("pro2", String.valueOf(var2.get()));
            intento1.putExtra("pro3", String.valueOf(var3.get()));
            intento1.putExtra("pro4", String.valueOf(var4.get()));
            intento1.putExtra("pro5", String.valueOf(var5.get()));
            intento1.putExtra("pro6", String.valueOf(var6.get()));
            intento1.putExtra("pro7", String.valueOf(var7.get()));
            intento1.putExtra("pro8", String.valueOf(var8.get()));
            intento1.putExtra("pro9", String.valueOf(var9.get()));
            intento1.putExtra("total",String.valueOf(total.get()));

            startActivity(intento1);


        });
    }
}