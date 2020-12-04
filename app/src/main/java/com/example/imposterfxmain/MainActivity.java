package com.example.imposterfxmain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_History;
    private Button btn_AddAccount;
    private Button btn_Main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addListenerOnButton (){
        btn_AddAccount=(Button)findViewById(R.id.btn_AddAccount);
        btn_History=(Button)findViewById(R.id.btn_History);
        btn_Main=(Button)findViewById(R.id.btn_Main);
        btn_History.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("соси ногу");
                        Intent intentHistory = new Intent();
                        intentHistory.setClass(MainActivity.this, HistoryActivity.class);
                        startActivity(intentHistory);
                    }
                }
        );
}
}