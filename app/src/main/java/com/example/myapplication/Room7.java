package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Room7 extends AppCompatActivity {
    EditText eText;
    SharedPreferences sPref;
    final String SAVED_TEXT = "saved_text";//переменные для сохранения текста
    public static int checkkey7;//переменная для проверки наличия ключа

    @Override
    //начало цикла onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room7);
        eText = (EditText)findViewById(R.id.hint);

        Window w = getWindow();
       // w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //кнопка возвращения на выбор кабинетов
        Button buttonBack = (Button)findViewById(R.id.buttonBackroom);
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Room7.this, Rooms.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
            }
        });

        //условие загрузить или удалить текст
        if (checkkey7 == 0){
          deleteText();
        } else{
           loadText();
        }
        //конец условия
        //начало кнопки взятия ключа
        Button takeButton = (Button) findViewById(R.id.buttontake);
        takeButton.setVisibility(View.VISIBLE);
        takeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                  Intent intent = new Intent(Room7.this, Rooms.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}

               // playButton.setBackgroundColor(getResources().getColor(R.color.teal_700, null));
                checkkey7 = 1;
               saveText();

            }
        });
        //конец кнопки взятия ключа


         //кнопка возвращения ключа
        Button returnButton = (Button) findViewById(R.id.buttonreturn);
        returnButton.setVisibility(View.VISIBLE);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Room7.this, Rooms.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                // playButton.setBackgroundColor(getResources().getColor(R.color.teal_700, null));
               deleteText();
                checkkey7 = 0;
            }
        });
        //конец кнопки возвращения ключа
    }
    //конец цикла onCreate



    //функция возвращения на выбор комнат с помощью системного возвращения
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Room7.this, Rooms.class);
            startActivity(intent);finish();
        }catch (Exception e) {}
    }
    //функция сохранения текста
    private void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();

        ed.putString(SAVED_TEXT, eText.getText().toString());
        ed.commit();

    }
    //функция загрузки текста
    private void loadText(){
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        eText.setText(savedText);

    }
   //функция удаления текста
    private void deleteText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        eText.setText(null);
    }


}
