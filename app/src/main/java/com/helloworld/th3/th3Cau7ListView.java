package com.helloworld.th3;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.helloworld.CustomAdapter;
import com.helloworld.R;

public class th3Cau7ListView extends AppCompatActivity {
    private ListView listView;
    private String[] titles = {"Android", "Blackberry", "Window Phone", "Apple"};
    private String[] subtitles1 = {"Subtitle 1", "Subtitle 2", "Subtitle 3", "Subtitle 4"};
    private String[] subtitles2 = {"Subtitle 1", "Subtitle 2", "Subtitle 3", "Subtitle 4"};
    private int[] images = {R.drawable.android, R.drawable.mobile, R.drawable.phone, R.drawable.apple};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_th3_cau7_list_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        int layout = R.layout.list_item;
        listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, titles, subtitles1, subtitles2, images, layout);
        listView.setAdapter(adapter);
    }
}