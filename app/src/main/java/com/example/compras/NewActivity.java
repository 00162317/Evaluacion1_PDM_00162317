package com.example.compras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.compras.utils.AppConstants;

public class NewActivity extends AppCompatActivity {
    TextView getUser, getEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mostrando();

    }
    private void mostrando(){
        Bundle bundle = getIntent().getExtras();
        String var1, var2;

        var1 = bundle.getString(AppConstants.TEXT_KEY);
        var2 = bundle.getString(AppConstants.TEXT_KEY_TWO);

        getUser=(TextView) findViewById(R.id.set_user);
        getUser.setText(var1);

        getEmail=(TextView) findViewById(R.id.set_email);
        getEmail.setText(var2);
    }
}
