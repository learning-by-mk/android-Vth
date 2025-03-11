package com.helloworld;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class th3Cau9FrenchTeacherApp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_th3_cau9_french_teacher_app);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickbtnBlack(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.black);
        mediaPlayer.start();
    }

    public void onClickbtnGreen(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.green);
        mediaPlayer.start();
    }

    public void onClickbtnPurple(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.purple);
        mediaPlayer.start();
    }

    public void onClickbtnRed(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.red);
        mediaPlayer.start();
    }

    public void onClickbtnYellow(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.yellow);
        mediaPlayer.start();
    }
}