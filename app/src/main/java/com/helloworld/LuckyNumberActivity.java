package com.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class LuckyNumberActivity extends AppCompatActivity {
    private Button btnLuck, btnShare;
    private EditText etName;
    private TextView tvTitle, tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lucky_number);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnLuck = findViewById(R.id.btnLuck);
        etName = findViewById(R.id.etName);
        tvTitle = findViewById(R.id.tvTitle);
        tvResult = findViewById(R.id.tvResult);
        btnShare = findViewById(R.id.btnShare);

        btnLuck.setOnClickListener(v -> {
            String name = etName.getText().toString();
            if (name.isEmpty()) {
                etName.setError("Name is required");
            } else {
                int luckyNumber = name.length() % 10;
                int lucky = new Random().nextInt(1000);
                etName.setVisibility(View.GONE);
                btnLuck.setVisibility(View.GONE);
                btnShare.setVisibility(View.VISIBLE);
                tvTitle.setText("Your lucky number is: ");
                String r = String.valueOf(lucky);
                tvResult.setText(r);
            }

        });
    }
}