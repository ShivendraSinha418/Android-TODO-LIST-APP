package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Description extends AppCompatActivity {
private Button save,clear;
private TextView showdesc;
private EditText desctxt;
private SharedPreferences pref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        save = findViewById(R.id.save);
        clear = findViewById(R.id.clear);
        showdesc = findViewById(R.id.showdesc);
        desctxt = findViewById(R.id.desctxt);
        Intent receive = getIntent();
        String intentData = receive.getStringExtra("inData");
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String desc = desctxt.getText().toString();
                    showdesc.setText(desc);
                    desctxt.setText("");
                    pref = getSharedPreferences("Desc",MODE_PRIVATE);
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString(intentData,desc);
                    editor.apply();
            }
        });
            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pref = getSharedPreferences("Desc",MODE_PRIVATE);
                    SharedPreferences.Editor editor = pref.edit();
                    editor.remove(intentData);
                    editor.apply();
                    showdesc.setText("");
                    Intent prev = new Intent(Description.this,MainActivity.class);
                    startActivity(prev);
                }
            });
      SharedPreferences getShared = getSharedPreferences("Desc",MODE_PRIVATE);
      String value = getShared.getString(intentData,"");
      showdesc.setText(value);
    }
}