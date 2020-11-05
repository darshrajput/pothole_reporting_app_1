package com.example.potholereporting;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.UserloginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
            public void openNewActivity(){
                Intent newActivity = new Intent(MainActivity.this, UserLogin.class);
                startActivity(newActivity);
            }
        });

        Button loginButton1 = (Button) findViewById(R.id.BMCloginButton);
        loginButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
            public void openNewActivity(){
                Intent newActivity = new Intent(MainActivity.this, BmcLogin.class);
                startActivity(newActivity);
            }
        });

    }

    @Override
    public void setActionBar(@Nullable Toolbar toolbar) {
        super.setActionBar(toolbar);
        Objects.requireNonNull(getActionBar()).setTitle("SPothole");

    }
}