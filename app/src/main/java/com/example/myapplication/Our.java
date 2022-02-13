package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Our extends AppCompatActivity implements View.OnClickListener {
    private EditText eTTML;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.our);
        Window w =  getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button buttonsent = (Button) findViewById(R.id.buttonsent);
        eTTML =(EditText)findViewById(R.id.eTTML);
        buttonsent.setOnClickListener(this);
        Button buttonBack = (Button)findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Our.this, MainActivity.class);
                    startActivity(intent);finish();

                }catch (Exception e)
                {
                }
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Our.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e)
                {
                }
            }
        });

    }
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Our.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e)
        {



        }
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonsent:
                if (eTTML.toString() == null) {
                    MainActivity.backToast = Toast.makeText(getBaseContext(), "Лист надіслано", Toast.LENGTH_SHORT);
                    MainActivity.backToast.show();
                }else {
                    MainActivity.backToast = Toast.makeText(getBaseContext(), "Лист надіслано", Toast.LENGTH_SHORT);
                    MainActivity.backToast.show();
                    try {
                        Intent intent = new Intent(Our.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }

                break;
            default:
                break;
        }
    }
}