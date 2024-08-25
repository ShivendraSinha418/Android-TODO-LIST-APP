package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private Button btn;
private TextView [] text;
private EditText editText;
private SharedPreferences shrd;
private ImageView about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = new TextView[12];
        text[0] = findViewById(R.id.text0);
        text[1] = findViewById(R.id.text1);
        text[2] = findViewById(R.id.text2);
        text[3] = findViewById(R.id.text3);
        text[4] = findViewById(R.id.text4);
        text[5] = findViewById(R.id.text5);
        text[6] = findViewById(R.id.text6);
        text[7] = findViewById(R.id.text7);
        text[8] = findViewById(R.id.text8);
        text[9] = findViewById(R.id.text9);
        text[10] = findViewById(R.id.text10);
        text[11] = findViewById(R.id.text11);
        editText = findViewById(R.id.edt);
        btn = findViewById(R.id.add);
        about = findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutIntent = new Intent(MainActivity.this,AboutPage.class);
                startActivity(aboutIntent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String task = editText.getText().toString();
                if(!(task.equals(""))){
                    for (int i =0;i<12;i++){
                        String currtask = text[i].getText().toString();
                        if(currtask.equals("")){
                            text[i].setText(Integer.toString(i+1) + "->" +task);
                            editText.setText("");
                            shrd = getSharedPreferences("todo",MODE_PRIVATE);
                            SharedPreferences.Editor editor = shrd.edit();
                            editor.putString(Integer.toString(i),text[i].getText().toString());
                            editor.apply();
                            break;
                        }
                    }
                }
            }
        });
        for(int i=0;i<12;i++) {
                SharedPreferences getShared = getSharedPreferences("todo", MODE_PRIVATE);
                String value = getShared.getString(Integer.toString(i), "");
                text[i].setText(value);
        }
        Intent next;
        next = new Intent(MainActivity.this,Description.class);
        text[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(text[0].getText().toString().equals(""))) {
                    next.putExtra("inData", "0");
                    startActivity(next);
                }
            }
        });
        text[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(text[1].getText().toString().equals(""))) {
                    next.putExtra("inData", "1");
                    startActivity(next);
                }
            }
        });
        text[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(text[2].getText().toString().equals(""))) {
                    next.putExtra("inData", "2");
                    startActivity(next);
                }
            }
        });
        text[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(text[3].getText().toString().equals(""))) {
                    next.putExtra("inData", "3");
                    startActivity(next);
                }
            }
        });
        text[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(text[4].getText().toString().equals(""))) {
                    next.putExtra("inData", "4");
                    startActivity(next);
                }
            }
        });
        text[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(text[5].getText().toString().equals(""))) {
                    next.putExtra("inData", "5");
                    startActivity(next);
                }
            }
        });
        text[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(text[6].getText().toString().equals(""))) {
                    next.putExtra("inData", "6");
                    startActivity(next);
                }
            }
        });
        text[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(text[7].getText().toString().equals(""))) {
                    next.putExtra("inData", "7");
                    startActivity(next);
                }
            }
        });
        text[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(text[8].getText().toString().equals(""))) {
                    next.putExtra("inData", "8");
                    startActivity(next);
                }
            }
        });
        text[0].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shrd = getSharedPreferences("todo",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.remove("0");
                editor.apply();
                text[0].setText("");
                return true;
            }
        });

        text[1].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shrd = getSharedPreferences("todo",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.remove("1");
                editor.apply();
                text[1].setText("");
                return true;
            }
        });
        text[2].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shrd = getSharedPreferences("todo",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.remove("2");
                editor.apply();
                text[2].setText("");
                return true;
            }
        });
        text[3].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shrd = getSharedPreferences("todo",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.remove("3");
                editor.apply();
                text[3].setText("");
                return true;
            }
        });
        text[4].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shrd = getSharedPreferences("todo",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.remove("4");
                editor.apply();
                text[4].setText("");
                return true;
            }
        });
        text[5].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shrd = getSharedPreferences("todo",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.remove("5");
                editor.apply();
                text[5].setText("");
                return true;
            }
        });        text[6].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shrd = getSharedPreferences("todo",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.remove("6");
                editor.apply();
                text[6].setText("");
                return true;
            }
        });        text[7].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shrd = getSharedPreferences("todo",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.remove("7");
                editor.apply();
                text[7].setText("");
                return true;
            }
        });        text[8].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shrd = getSharedPreferences("todo",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.remove("8");
                editor.apply();
                text[8].setText("");
                return true;
            }
        });




    }
}