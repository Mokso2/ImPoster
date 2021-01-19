package com.example.imposter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.imposterfxmain.R;

public class FirstContactMobile extends AppCompatActivity {
    private Button btn_toMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_contact_mobile);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        btn_toMain=(Button)findViewById(R.id.btn_mainsen);
        btn_toMain.setOnClickListener(
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