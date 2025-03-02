package com.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button nextCounterButton, sayHelloButton;
    private EditText nameInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nextCounterButton = findViewById(R.id.btnToCounter);
        sayHelloButton = findViewById(R.id.btnSayHello);
        nameInput = findViewById(R.id.inputName);

        nextCounterButton.setOnClickListener(v -> nextCounterActivity());

        sayHelloButton.setOnClickListener(v -> sayHello());
    }

    public void nextCounterActivity() {
        Intent intent = new Intent(this, CounterActivity.class);
        startActivity(intent);
    }

    public void sayHello() {
        String name = nameInput.getText().toString().trim();
        if (name.isEmpty()) Toast.makeText(this, "Nhập tên hộ", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "Xin chào " + name, Toast.LENGTH_SHORT).show();
    }
}