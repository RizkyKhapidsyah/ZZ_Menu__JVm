package com.rk.m;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ty_context_menu extends AppCompatActivity {
    TextView TV_Judul_CM_IDJAVA;
    String JudulMenu = "Silahkan Pilih Menu :";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ty_context_menu);

        TV_Judul_CM_IDJAVA = findViewById(R.id.TV_Judul_CM_IDXML);
        registerForContextMenu(TV_Judul_CM_IDJAVA);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle(JudulMenu);
        getMenuInflater().inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
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
                return super.onContextItemSelected(item);
        }
    }
}
