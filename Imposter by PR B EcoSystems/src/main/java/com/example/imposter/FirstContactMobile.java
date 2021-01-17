package com.example.imposter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstContactMobile extends AppCompatActivity {
    Button btn_Join = (Button) findViewById(R.id.btn_Join);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_contact_mobile);

        View.OnClickListener OclOnJoin = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println("Кнопку нажал - спать лёг.");
                Intent ToMain = new Intent(FirstContactMobile.this, MainActivity.class);
                startActivity(ToMain);
                System.out.println("Кнопка работает");
                System.out.println("Кнопку нажал - Максу пирожочек дал.");
            }
        };


    }

}