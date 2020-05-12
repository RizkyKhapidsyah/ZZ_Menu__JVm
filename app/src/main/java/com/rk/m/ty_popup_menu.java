package com.rk.m;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ty_popup_menu extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button B_PopupMenu_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ty_popup_menu);

        B_PopupMenu_IDJAVA = findViewById(R.id.B_PopupMenu_IDXML);
        B_PopupMenu_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu PM = new PopupMenu(getApplicationContext(), B_PopupMenu_IDJAVA);
                PM.inflate(R.menu.menu);
                PM.show();
                PM.setOnMenuItemClickListener(ty_popup_menu.this);
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.OM_OptionMenu_A_IDXML:
                Toast.makeText(this, "Anda Memilih Option Menu A", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.OM_OptionMenu_B_IDXML:
                Toast.makeText(this, "Anda Memilih Option Menu B", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.OM_OptionMenu_C_IDXML:
                Toast.makeText(this, "Anda Memilih Option Menu C", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.OM_OptionMenu_D_IDXML:
                Toast.makeText(this, "Anda Memilih Option Menu D", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.OM_OptionMenu_D1_IDXML:
                Toast.makeText(this, "Anda Memilih Option Menu D1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.OM_OptionMenu_D2_IDXML:
                Toast.makeText(this, "Anda Memilih Option Menu D2", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}
