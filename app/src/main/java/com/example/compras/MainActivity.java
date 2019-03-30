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

        cajaValor1=findViewById(R.id.valor1);
        cajaValor2=findViewById(R.id.valor2);
        cajaValor3=findViewById(R.id.valor3);
        cajaValor4=findViewById(R.id.valor4);
        cajaValor5=findViewById(R.id.valor5);
        cajaValor6=findViewById(R.id.valor6);
        cajaValor7=findViewById(R.id.valor7);
        cajaValor8=findViewById(R.id.valor8);
        cajaValor9=findViewById(R.id.valor9);

        layoutUno=findViewById(R.id.linearUno);
        layoutDos=findViewById(R.id.linearDos);
        layoutTres=findViewById(R.id.linearTres);
        layoutCuatro=findViewById(R.id.linearCuatro);
        layoutCinco=findViewById(R.id.linearCinco);
        layoutSeis=findViewById(R.id.linearSeis);
        layoutSiete=findViewById(R.id.linearSiete);
        layoutOcho=findViewById(R.id.linearOcho);
        layoutNueve=findViewById(R.id.linearNueve);

        final EditText exportarUser=(EditText) findViewById(R.id.get_user),
                exportarEmail=(EditText) findViewById(R.id.get_email);

        Button btn = (Button) findViewById(R.id.btn_enviar);

        comprasContador();

        btn.setOnClickListener(v->{
            Intent intento1 = new Intent(MainActivity.this, NewActivity.class);
            String nickname  = exportarUser.getText().toString();
            String correo = exportarEmail.getText().toString();

            intento1.putExtra(AppConstants.TEXT_KEY,nickname);
            intento1.putExtra(AppConstants.TEXT_KEY_TWO,correo);

            startActivity(intento1);


            });
        }

        public void comprasContador(){
            AtomicInteger total  = new AtomicInteger();
            AtomicInteger cont = new AtomicInteger();
            layoutUno.setOnClickListener(v ->{
                cont.set(Integer.parseInt(cajaValor1.getText().toString())+1);
                cajaValor1.setText(String.valueOf(cont));
                total.set(total.get()+cont.get());
            });

            layoutDos.setOnClickListener(v ->{
                cont.set(Integer.parseInt(cajaValor2.getText().toString())+1);
                cajaValor2.setText(String.valueOf(cont));
                total.set(total.get()+cont.get());
            });

            layoutTres.setOnClickListener(v ->{
                cont.set(Integer.parseInt(cajaValor3.getText().toString())+1);
                cajaValor3.setText(String.valueOf(cont));
                total.set(total.get()+cont.get());
            });

            layoutCuatro.setOnClickListener(v ->{
                cont.set(Integer.parseInt(cajaValor4.getText().toString())+1);
                cajaValor4.setText(String.valueOf(cont));
                total.set(total.get()+cont.get());
            });

            layoutCinco.setOnClickListener(v ->{
                cont.set(Integer.parseInt(cajaValor5.getText().toString())+1);
                cajaValor5.setText(String.valueOf(cont));
                total.set(total.get()+cont.get());
            });

            layoutSeis.setOnClickListener(v ->{
                cont.set(Integer.parseInt(cajaValor6.getText().toString())+1);
                cajaValor6.setText(String.valueOf(cont));
                total.set(total.get()+cont.get());
            });

            layoutSiete.setOnClickListener(v ->{
                cont.set(Integer.parseInt(cajaValor7.getText().toString())+1);
                cajaValor7.setText(String.valueOf(cont));
                total.set(total.get()+cont.get());
            });

            layoutOcho.setOnClickListener(v ->{
                cont.set(Integer.parseInt(cajaValor8.getText().toString())+1);
                cajaValor8.setText(String.valueOf(cont));
                total.set(total.get()+cont.get());
            });

            layoutNueve.setOnClickListener(v ->{
                cont.set(Integer.parseInt(cajaValor9.getText().toString())+1);
                cajaValor9.setText(String.valueOf(cont));
                total.set(total.get()+cont.get());
            });

        }

        }

