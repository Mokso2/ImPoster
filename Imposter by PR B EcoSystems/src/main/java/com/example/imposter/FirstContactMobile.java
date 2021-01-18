package com.example.imposter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstContactMobile extends AppCompatActivity {
    private Button btn_Join;
    private TextView myText = (TextView) findViewById(R.id.txt_descrApp);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_contact_mobile);
        addListenerOnButton();
    }

    public void user_Login(View v){
        myText.setText("Хи-хи-хи");
    }

    public void addListenerOnButton(){
        btn_Join = (Button) findViewById(R.id.myButton);

        btn_Join.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("Кнопку нажал - спать лёг.");
                        // Intent ToMain = new Intent(FirstContactMobile.this, MainActivity.class);
                       // startActivity(ToMain);
                        System.out.println("Кнопка работает");
                        System.out.println("Кнопку нажал - Максу пирожочек дал.");
                        myText.setText("Я бомж.");
                    }
                }
        );
    }
}