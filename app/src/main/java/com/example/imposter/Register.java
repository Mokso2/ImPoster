package com.example.imposter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.imposterfxmain.R;

import org.w3c.dom.Text;

public class Register extends AppCompatActivity {
private Button btn_toMain;
private TextView txt_Entrance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        addListenerOnButton();
    }
    public void addListenerOnButton (){
        btn_toMain=(Button)findViewById(R.id.btn_toMain);
        txt_Entrance=(TextView)findViewById(R.id.txt_Entrance);
        btn_toMain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent toMain = new Intent(Register.this,MainActivity.class);
                        startActivity(toMain);
                    }
                }
        );
        txt_Entrance.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent toFirst = new Intent(Register.this,Registration.class);
                        startActivity(toFirst);
                    }
                }
        );
    }

}