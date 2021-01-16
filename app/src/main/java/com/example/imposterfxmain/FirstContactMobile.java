package com.example.imposterfxmain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstContactMobile extends AppCompatActivity {
    private Button btn_mainsen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_contact_mobile);
    }
    public void addListenerOnButton(){
        btn_mainsen=(Button)findViewById(R.id.btn_mainsen);
        btn_mainsen.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ToMain= new Intent(FirstContactMobile.this,MainActivity.class);
                        startActivity(ToMain);

                    }
                }
        );

    }
}