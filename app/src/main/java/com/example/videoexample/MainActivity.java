package com.example.videoexample;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
        VideoView VideoView = findViewById(R.id.videoView);

        String vPath = "android.resource://"+getPackageName()+"/raw/sample";

        Uri videoURI = Uri.parse(vPath);


        //VideoView.setVideoPath(vPath);
        VideoView.setVideoURI(videoURI);
        VideoView.start();

        MediaController mediaController = new MediaController(this);
        VideoView.setMediaController(mediaController);
        mediaController.setAnchorView(VideoView);

    }
}