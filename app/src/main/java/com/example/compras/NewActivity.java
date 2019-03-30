package com.example.compras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.compras.utils.AppConstants;

public class NewActivity extends AppCompatActivity {
    TextView getUser, getEmail, totalProducto;
    TextView valorUno, valorDos, valorTres, valorCuatro, valorCinco, valorSeis, valorSiete, valorOcho, valorNueve;

    Button compartir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mostrando();

        valorUno=findViewById(R.id.valor1);
        valorDos=findViewById(R.id.valor2);
        valorTres=findViewById(R.id.valor3);
        valorCuatro=findViewById(R.id.valor4);
        valorCinco=findViewById(R.id.valor5);
        valorSeis=findViewById(R.id.valor6);
        valorSiete=findViewById(R.id.valor7);
        valorOcho=findViewById(R.id.valor8);
        valorNueve=findViewById(R.id.valor9);
        totalProducto=findViewById(R.id.set_total);
        compartir=findViewById(R.id.btn_share);

        getNumeroIntent();

        Intent intentDos  = getIntent();
        String[] texto = intentDos.getStringArrayExtra(Intent.EXTRA_TEXT);
        /*if(intentDos!= null){
            valorUno.setText(texto[0]);
        }*/
        compartir.setOnClickListener(v->{
        Intent intentoTres = new Intent();
        intentoTres.setAction(Intent.ACTION_SEND);
        intentoTres.setType("text/plain");

        intentoTres.putExtra(Intent.EXTRA_TEXT,texto[0]);

        startActivity(intentoTres);
        });


    }
    private void mostrando(){
        Bundle bundle = getIntent().getExtras();
        String var1, var2;

        var1 = bundle.getString(AppConstants.TEXT_KEY);
        var2 = bundle.getString(AppConstants.TEXT_KEY_TWO);

        getUser=(TextView) findViewById(R.id.set_user);
        getEmail=(TextView) findViewById(R.id.set_email);
        getUser.setText(var1);

        getEmail.setText(var2);
    }
    public void getNumeroIntent(){
        Intent mIntent = getIntent();
        valorUno.setText(mIntent.getStringExtra("pro1"));
        valorDos.setText(mIntent.getStringExtra("pro2"));
        valorTres.setText(mIntent.getStringExtra("pro3"));
        valorCuatro.setText(mIntent.getStringExtra("pro4"));
        valorCinco.setText(mIntent.getStringExtra("pro5"));
        valorSeis.setText(mIntent.getStringExtra("pro6"));
        valorSiete.setText(mIntent.getStringExtra("pro7"));
        valorOcho.setText(mIntent.getStringExtra("pro8"));
        valorNueve.setText(mIntent.getStringExtra("pro9"));
        totalProducto.setText(mIntent.getStringExtra("total"));
    }
}
