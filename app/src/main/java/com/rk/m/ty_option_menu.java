package com.rk.m;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ty_option_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ty_option_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater MI = getMenuInflater();
        MI.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
                return super.onOptionsItemSelected(item);

        }
    }
}
