package com.helloworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class th3Cau5AppCalculate extends AppCompatActivity {
    private EditText edNum1, edNum2;
    private TextView tvResult;
    private Button btnClick;
    private Spinner spnOperator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_th3_cau5_app_calculate);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edNum1 = findViewById(R.id.ednum1);
        edNum2 = findViewById(R.id.ednum2);
        tvResult = findViewById(R.id.tvresult);
        btnClick = findViewById(R.id.btnClick);
        spnOperator = findViewById(R.id.spnOperator);

        btnClick.setOnClickListener(v -> {

            try {
                double num1 = Double.parseDouble(edNum1.getText().toString());
                double num2 = Double.parseDouble(edNum2.getText().toString());
                String operator = spnOperator.getSelectedItem().toString();
                tvResult.setText(calculator(num1, num2, operator));
            }catch (Exception e) {
                Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String calculator(Double num1,Double num2, String operator) {
        switch (operator) {
            case "+": return String.valueOf(num1 + num2);
            case "-": return String.valueOf(num1 - num2);
            case "*": return String.valueOf(num1 * num2);
            case "/": return String.valueOf(num1 / num2);
            case "**": return String.valueOf(Math.pow(num1, num2));
            default: return "Error";
        }
    }
}