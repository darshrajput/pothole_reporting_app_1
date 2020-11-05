package com.example.potholereporting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BmcSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmc_sign_up);

        TextView signIn = (TextView) findViewById(R.id.textViewBmcSignIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BmcSignUp.this, BmcLogin.class);
                startActivity(intent);
            }
        });

        Button signUp = (Button) findViewById(R.id.buttonBmcSignUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BmcSignUp.this, ViewPotholes.class);
                startActivity(intent);
            }
        });
    }
}