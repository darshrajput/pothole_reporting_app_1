package com.example.potholereporting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BmcLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmc_login);

        TextView signUp = (TextView) findViewById(R.id.textViewBmcSignUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BmcLogin.this, BmcSignUp.class);
                startActivity(intent);
            }
        });

        Button login = (Button) findViewById(R.id.buttonBmcSignIn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BmcLogin.this, ViewPotholes.class);
                startActivity(intent);
            }
        });
    }
}