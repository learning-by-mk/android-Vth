package com.helloworld.th3;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.helloworld.R;

public class th3Cau2RadioButton extends AppCompatActivity {
    private RadioButton rbTomato, rbCheese;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_th3_cau2_radio_button);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rbTomato = findViewById(R.id.rbTomato);
        rbCheese = findViewById(R.id.rbCheese);
        rbTomato.setOnCheckedChangeListener((btView, isChecked) -> {
            if (isChecked) {
                rbCheese.setChecked(false);
                Toast.makeText(this, "Bạn chọn cà chua", Toast.LENGTH_SHORT).show();
                return;
            }
        });

        rbCheese.setOnCheckedChangeListener((btView, isChecked) -> {
            if (isChecked) {
                rbTomato.setChecked(false);
                Toast.makeText(this, "Bạn chọn phô mai", Toast.LENGTH_SHORT).show();
                return;
            }
        });
    }
}