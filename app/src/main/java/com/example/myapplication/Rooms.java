package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rooms extends AppCompatActivity implements View.OnClickListener {

    @Override
    //начало класса onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rooms);
        Window w =  getWindow();

        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //убирает панельку сверху
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(this); // calling onClick() method
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(this);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) findViewById(R.id.textView_4);
        textView4.setOnClickListener(this); // calling onClick() method
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setOnClickListener(this);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setOnClickListener(this);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setOnClickListener(this); // calling onClick() method
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(this);
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setOnClickListener(this);
        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setOnClickListener(this); // calling onClick() method
        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setOnClickListener(this); // calling onClick() method
        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setOnClickListener(this);
        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setOnClickListener(this);
        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setOnClickListener(this); // calling onClick() method
        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setOnClickListener(this);
        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setOnClickListener(this);
        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setOnClickListener(this); // calling onClick() method
        TextView textView18 = (TextView) findViewById(R.id.textView18);
        textView18.setOnClickListener(this);
        TextView textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setOnClickListener(this);
        TextView textView20 = (TextView) findViewById(R.id.textView20);
        textView20.setOnClickListener(this); // calling onClick() method
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setOnClickListener(this);
        TextView textView22 = (TextView) findViewById(R.id.textView22);
        textView22.setOnClickListener(this);
        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setOnClickListener(this); // calling onClick() method
        TextView textView24 = (TextView) findViewById(R.id.textView24);
        textView24.setOnClickListener(this);
        TextView textView25 = (TextView) findViewById(R.id.textView25);
        textView25.setOnClickListener(this);
        TextView textView26 = (TextView) findViewById(R.id.textView26);
        textView26.setOnClickListener(this); // calling onClick() method
        TextView textView27 = (TextView) findViewById(R.id.textView27);
        textView27.setOnClickListener(this);
        TextView textView28 = (TextView) findViewById(R.id.textView28);
        textView28.setOnClickListener(this);
        TextView textView29 = (TextView) findViewById(R.id.textView29);
        textView29.setOnClickListener(this); // calling onClick() method
        TextView textView30 = (TextView) findViewById(R.id.textView30);
        textView30.setOnClickListener(this);

        //возвращение на главную страницу
        Button buttonBack = (Button)findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Rooms.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
            }
        });
        //конец возвращения


        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room1.checkkey == 1 ){
         textView1.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room1.checkkey == 0 ){
            textView1.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room2.checkkey2 == 1 ){
            textView2.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room2.checkkey2 == 0 ){
            textView2.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room3.checkkey3 == 1 ){
            textView3.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room3.checkkey3 == 0 ){
            textView3.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room4.checkkey4 == 1 ){
            textView4.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room4.checkkey4 == 0 ){
            textView4.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room5.checkkey5 == 1 ){
            textView5.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room5.checkkey5 == 0 ){
            textView5.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия


        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room6.checkkey6 == 1 ){
            textView6.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room6.checkkey6 == 0 ){
            textView6.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room7.checkkey7 == 1 ){
            textView7.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room7.checkkey7 == 0 ){
            textView7.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room8.checkkey8 == 1 ){
            textView8.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room8.checkkey8 == 0 ){
            textView8.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room9.checkkey9 == 1 ){
            textView9.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room9.checkkey9 == 0 ){
            textView9.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room10.checkkey10 == 1 ){
            textView10.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room10.checkkey10 == 0 ){
            textView10.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия


        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room11.checkkey11 == 1 ){
            textView11.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room11.checkkey11 == 0 ){
            textView11.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room12.checkkey12 == 1 ){
            textView12.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room12.checkkey12 == 0 ){
            textView12.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room13.checkkey13 == 1 ){
            textView13.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room13.checkkey13 == 0 ){
            textView13.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room14.checkkey14 == 1 ){
            textView14.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room14.checkkey14 == 0 ){
            textView14.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия
        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room15.checkkey15 == 1 ){
            textView15.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room15.checkkey15 == 0 ){
            textView15.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room16.checkkey16 == 1 ){
            textView16.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room16.checkkey16 == 0 ){
            textView16.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room17.checkkey17 == 1 ){
            textView17.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room17.checkkey17 == 0 ){
            textView17.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room18.checkkey18 == 1 ){
            textView18.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room18.checkkey18 == 0 ){
            textView18.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room19.checkkey19 == 1 ){
            textView19.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room19.checkkey19 == 0 ){
            textView19.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room20.checkkey20 == 1 ){
            textView20.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room20.checkkey20 == 0 ){
            textView20.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия
        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room21.checkkey21 == 1 ){
            textView21.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room21.checkkey21 == 0 ){
            textView21.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room22.checkkey22 == 1 ){
            textView22.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room22.checkkey22 == 0 ){
            textView22.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room23.checkkey23 == 1 ){
            textView23.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room23.checkkey23 == 0 ){
            textView23.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room24.checkkey24 == 1 ){
            textView24.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room24.checkkey24 == 0 ){
            textView24.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room25.checkkey25 == 1 ){
            textView25.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room25.checkkey25 == 0 ){
            textView25.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room26.checkkey26 == 1 ){
            textView26.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room26.checkkey26 == 0 ){
            textView26.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room27.checkkey27 == 1 ){
            textView27.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room27.checkkey27 == 0 ){
            textView27.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room28.checkkey28 == 1 ){
            textView28.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room28.checkkey28 == 0 ){
            textView28.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room29.checkkey29 == 1 ){
            textView29.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room29.checkkey29 == 0 ){
            textView29.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия

        //если переменная равна 1 то кнопка будет красной а если 0 тогда зелёной
        if (Room30.checkkey30 == 1 ){
            textView30.setBackground(getDrawable(R.drawable.style_btn_red));
        } else if (Room30.checkkey30 == 0 ){
            textView30.setBackground(getDrawable(R.drawable.style_btn_green));
        }
        //конец условия
    }
    //конец цикла onCreate

    @Override
    //класс перехода с данного активити в прошлый
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Rooms.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e) {}
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView1:
                try {
                    Intent intent = new Intent(Rooms.this, Room1.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView2:
                try {
                    Intent intent = new Intent(Rooms.this, Room2.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView3:
                try {
                    Intent intent = new Intent(Rooms.this, Room3.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView_4:
                try {
                    Intent intent = new Intent(Rooms.this, Room4.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView5:
                try {
                    Intent intent = new Intent(Rooms.this, Room5.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView6:
                try {
                    Intent intent = new Intent(Rooms.this, Room6.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}

                break;
            case R.id.textView7:
                try {
                    Intent intent = new Intent(Rooms.this, Room7.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView8:
                try {
                    Intent intent = new Intent(Rooms.this, Room8.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView9:
                try {
                    Intent intent = new Intent(Rooms.this, Room9.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}

                break;
            case R.id.textView10:
                try {
                    Intent intent = new Intent(Rooms.this, Room10.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView11:
                try {
                    Intent intent = new Intent(Rooms.this, Room11.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView12:
                try {
                    Intent intent = new Intent(Rooms.this, Room12.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}

                break;
            case R.id.textView13:
                try {
                    Intent intent = new Intent(Rooms.this, Room13.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView14:
                try {
                    Intent intent = new Intent(Rooms.this, Room14.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView15:
                try {
                    Intent intent = new Intent(Rooms.this, Room15.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}

                break;
            case R.id.textView16:
                try {
                    Intent intent = new Intent(Rooms.this, Room16.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView17:
                try {
                    Intent intent = new Intent(Rooms.this, Room17.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView18:
                try {
                    Intent intent = new Intent(Rooms.this, Room18.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}

                break;
            case R.id.textView19:
                try {
                    Intent intent = new Intent(Rooms.this, Room19.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView20:
                try {
                    Intent intent = new Intent(Rooms.this, Room20.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView21:
                try {
                    Intent intent = new Intent(Rooms.this, Room21.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}

                break;
            case R.id.textView22:
                try {
                    Intent intent = new Intent(Rooms.this, Room22.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView23:
                try {
                    Intent intent = new Intent(Rooms.this, Room23.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView24:
                try {
                    Intent intent = new Intent(Rooms.this, Room24.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}

                break;
            case R.id.textView25:
                try {
                    Intent intent = new Intent(Rooms.this, Room25.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView26:
                try {
                    Intent intent = new Intent(Rooms.this, Room26.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView27:
                try {
                    Intent intent = new Intent(Rooms.this, Room27.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}

                break;
            case R.id.textView28:
                try {
                    Intent intent = new Intent(Rooms.this, Room28.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView29:
                try {
                    Intent intent = new Intent(Rooms.this, Room29.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}
                break;
            case R.id.textView30:
                try {
                    Intent intent = new Intent(Rooms.this, Room30.class);
                    startActivity(intent);finish();
                }catch (Exception e) {}

                break;
            default:
                break;
        }
    }
    //конец класса
}