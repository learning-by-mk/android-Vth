package com.helloworld.th3;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.helloworld.R;

public class th3Cau6ListView extends AppCompatActivity {
    private TextView tvResult;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_th3_cau6_list_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvResult = findViewById(R.id.tvResult);
        listView = findViewById(R.id.lvCountries);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            for (int i = 0; i < parent.getChildCount(); i++) {
                parent.getChildAt(i).setBackgroundColor(android.R.color.transparent);
            }
            view.setBackgroundColor(Color.parseColor("#FFC107FF"));
            String valInItem = parent.getItemAtPosition(position).toString();
            tvResult.setText("Bạn đã chọn: " + valInItem);
        });
    }
}