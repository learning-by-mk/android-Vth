package com.helloworld.th3;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.helloworld.PlanetAppAdapter;
import com.helloworld.R;

public class th3Cau8PlanetsApp extends AppCompatActivity {
    private ListView lvPlanets;
    private String[] titles = {"Earth", "Jupiter", "Mars", "Neptune", "Pluto", "Mercury", "Saturn", "Uranus", "Venus"};
    private String[] subtitles = {"11", "21", "11", "12", "12", "11", "11", "11", "11"};
    private int[] images = {R.drawable.earth, R.drawable.jupiter, R.drawable.mars, R.drawable.neptune, R.drawable.pluto, R.drawable.mercury, R.drawable.saturn, R.drawable.uranus, R.drawable.venus};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_th3_cau8_planets_app);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lvPlanets = findViewById(R.id.lvPlanets);
        PlanetAppAdapter adapter = new PlanetAppAdapter(this, titles, images, subtitles);
        lvPlanets.setAdapter(adapter);

        lvPlanets.setOnItemClickListener(((parent, view, position, id) -> {
            Toast.makeText(this, titles[position], Toast.LENGTH_SHORT).show();
        }));
    }
}