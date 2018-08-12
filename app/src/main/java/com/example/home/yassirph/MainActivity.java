package com.example.home.yassirph;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.graphics.Color.BLACK;

public class MainActivity extends AppCompatActivity {

    private Button login ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.login_btn);
        login.setBackgroundColor(Color.BLACK);
    }

    public void login_btn(View view) {
        //EditText user = (EditText) findViewById(R.id.user_name);
        //EditText password = (EditText) findViewById(R.id.password);

        Intent intent = new Intent(this,ChercheUserActivity.class);
        startActivity(intent);
    }
}
