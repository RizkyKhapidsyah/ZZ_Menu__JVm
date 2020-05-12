package com.rk.m;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button B_OptionMenu_IDJAVA, B_ContextMenu_IDJAVA, B_PopUpMenu_IDJAVA;
    Intent X;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_OptionMenu_IDJAVA = findViewById(R.id.B_OptionMenu_IDXML);
        B_ContextMenu_IDJAVA = findViewById(R.id.B_ContextMenu_IDXML);
        B_PopUpMenu_IDJAVA = findViewById(R.id.B_PopUpMenu_IDXML);


        B_OptionMenu_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                X = new Intent(MainActivity.this, ty_option_menu.class);
                startActivity(X);
            }
        });

        B_ContextMenu_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                X = new Intent(MainActivity.this, ty_context_menu.class);
                startActivity(X);
            }
        });

        B_PopUpMenu_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                X = new Intent(MainActivity.this, ty_popup_menu.class);
                startActivity(X);
            }
        });

    }
}
