package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static long BackPressedTime;//переменная для дабл тапа на нижней панели(для выхода)
    public static Toast backToast;//то же самое что и первое
    //private static int checkkey переменная для проверки наличия/отсутствия
    @Override
    //начало цикла onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window w =  getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

       // начало обработки кнопки начать
        Button buttonStart = (Button)findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, Rooms.class);
                    startActivity(intent);finish();
                }catch (Exception e)
                {
                }
            }
        });
           //конец обработки кнопки "начать"


        //начало обработки кнопки "о нас"
        Button buttonOur = (Button)findViewById(R.id.buttonour);
        buttonOur.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, Our.class);
                    startActivity(intent);finish();
                }catch (Exception e)
                {
                }
            }
        });
         //конец обработки кнопки "о нас"


        //обработка кнопки "инструкция"
        Button buttonIntroduction = (Button)findViewById(R.id.buttonintroduction);
       buttonIntroduction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, Licenser.class);
                    startActivity(intent);finish();
                }catch (Exception e){}
            }
        });
       //конец обработки кнопки "инструкция
    }
   //конец цикла OnCreate
    @Override

    public void onBackPressed() {
             //если после первого тапа прошло больше 2-х сек тогда ничего не произойдёт если же в течении двух секунд нажать ещё ра то выйдет из програмы
        if (BackPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else {
           backToast= Toast.makeText(getBaseContext(), "Нажмите ещё раз, что бы можно было выйти", Toast.LENGTH_SHORT);
           backToast.show();
        }
        BackPressedTime = System.currentTimeMillis();
    }
}