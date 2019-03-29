package com.example.compras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.compras.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText exportarUser=(EditText) findViewById(R.id.get_user),
                exportarEmail=(EditText) findViewById(R.id.get_email);

        Button btn = (Button) findViewById(R.id.btn_enviar);

        btn.setOnClickListener(v->{
            Intent intento1 = new Intent(MainActivity.this, NewActivity.class);
            String nickname  = exportarUser.getText().toString();
            String correo = exportarEmail.getText().toString();

            intento1.putExtra(AppConstants.TEXT_KEY,nickname);
            intento1.putExtra(AppConstants.TEXT_KEY_TWO,correo);

            startActivity(intento1);
        });
    }
}
