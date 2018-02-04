package com.example.nidhi.elearn;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSignup,btnlogin;
        btnlogin=(Button) findViewById(R.id.login);
        btnSignup=(Button) findViewById(R.id.signup);
        Typeface tfFutura = Typeface.createFromAsset(getAssets(), "font.ttf");

    }
}
