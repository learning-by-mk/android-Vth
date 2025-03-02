package com.helloworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CounterActivity extends AppCompatActivity {

    private Button btnClick;
    private TextView textCounted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_counter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textCounted = findViewById(R.id.textCounted);
        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(v -> counterClicked());
    }

    public void counterClicked() {
        int count = Integer.parseInt(String.valueOf(textCounted.getText()));
        count++;
        textCounted.setText(String.valueOf(count));
    }
}