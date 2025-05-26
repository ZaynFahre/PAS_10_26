package com.example.ligaspanyolapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;  // ini tempat tampilan hasilnya

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textView = new TextView(this);
        textView.setTextSize(18);
        setContentView(textView); // tampilkan TextView ke layar
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // hubungkan menu dari XML
        getMenuInflater().inflate(R.menu.bottom_nav_mrnu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // ketika menu dipilih
        int id = item.getItemId();

        if (id == R.id.menu_liga) {
            textView.setText("⚽ Liga Spanyol: Real Madrid, Barcelona, dll.");
            return true;
        } else if (id == R.id.menu_api) {
            textView.setText("📡 API selain Liga Inggris: Bundesliga, Serie A.");
            return true;
        } else if (id == R.id.menu_profil) {
            textView.setText("👦 Nama: Fajar Nugraha\n👩 Teman: Siti, Dimas\n🏫 Kelas: XI RPL 1");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
