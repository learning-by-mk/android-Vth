package com.helloworld;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class th4Cau1 extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_th4_cau1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView = findViewById(R.id.listview);

        try {
            int[] images = new int[16];
            String[] titles = new String[16];
            String[] subtitle = new String[16];
            String[] subtitle2 = new String[16];

            for (int i = 0; i < 16; i++) {
                int index = i + 1;
                String nameImage = "a" + index;
                images[i] = getResources().getIdentifier(nameImage, "drawable", getPackageName());

                titles[i] = "Hehe " + i;
                subtitle[i] = "huhu" + i;
                subtitle2[i] = "huhu" + i;
            }

            CustomAdapter adapter = new CustomAdapter(this, titles, subtitle, subtitle2, images, R.layout.list_item_circle_view);
            listView.setAdapter(adapter);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}