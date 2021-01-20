package com.example.imposter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.imposterfxmain.R;

public class Registration extends AppCompatActivity {
private TextView txt_Entrance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        addListenerOnButton();
    }
    public void addListenerOnButton (){
        txt_Entrance=(TextView)findViewById(R.id.txt_Entrance);
        txt_Entrance.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent toFirst = new Intent(Registration.this,Register.class);
                        startActivity(toFirst);
                    }
                }
        );
    }
}