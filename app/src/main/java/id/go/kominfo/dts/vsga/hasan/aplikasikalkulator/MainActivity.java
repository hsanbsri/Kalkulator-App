package id.go.kominfo.dts.vsga.hasan.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etAngka1;
    EditText etAngka2;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null)
            setTitle("Aplikasi Kalkulator");

        etAngka1 = findViewById(R.id.etAngkaPertama);
        etAngka2 = findViewById(R.id.etAngkaKedua);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btBersihkan = findViewById(R.id.btBersihkan);
        TextView tvHasil = findViewById(R.id.tvHasil);

        btTambah.setOnClickListener(v -> {

            if(!etAngka1.getText().toString().isEmpty() &&
                    !etAngka2.getText().toString().isEmpty()){
                double a = Double.parseDouble(etAngka1.getText().toString());
                double b = Double.parseDouble(etAngka2.getText().toString());
                double hasil = a + b;
                tvHasil.setText(Double.toString(hasil));
            }
        });
        btKurang.setOnClickListener(v -> {
            if(!etAngka1.getText().toString().isEmpty() &&
                    !etAngka2.getText().toString().isEmpty()){
                double a = Double.parseDouble(etAngka1.getText().toString());
                double b = Double.parseDouble(etAngka2.getText().toString());
                double hasil = a - b;
                tvHasil.setText(Double.toString(hasil));
            }
        });
        btKali.setOnClickListener(v -> {
            if(!etAngka1.getText().toString().isEmpty() &&
                    !etAngka2.getText().toString().isEmpty()){
                double a = Double.parseDouble(etAngka1.getText().toString());
                double b = Double.parseDouble(etAngka2.getText().toString());
                double hasil = a * b;
                tvHasil.setText(Double.toString(hasil));
            }
        });
        btBagi.setOnClickListener(v -> {
            if(!etAngka1.getText().toString().isEmpty() &&
                    !etAngka2.getText().toString().isEmpty()){
                double a = Double.parseDouble(etAngka1.getText().toString());
                double b = Double.parseDouble(etAngka2.getText().toString());
                if(b==0){
                    Toast.makeText(this, "Angka kedua tidak boleh 0",
                            Toast.LENGTH_SHORT).show();
                    return; //keluar dari method setOnClick() btBagi
                }
                double hasil = a / b;
                tvHasil.setText(Double.toString(hasil));
            }
        });
        btBersihkan.setOnClickListener(v -> {
            etAngka1.setText("");
            etAngka2.setText("");
            etAngka1.requestFocus();
        });
    }
}