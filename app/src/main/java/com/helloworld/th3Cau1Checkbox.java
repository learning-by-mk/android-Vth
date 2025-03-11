package com.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class th3Cau1Checkbox extends AppCompatActivity {
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_th3_cau1_checkbox);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener((btnView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Checked", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Unchecked", Toast.LENGTH_SHORT).show();

        });
    }

//    public void eventCheckbox(View view) {
//        Toast.makeText(this, "Huhu", Toast.LENGTH_SHORT).show();
//    }
}