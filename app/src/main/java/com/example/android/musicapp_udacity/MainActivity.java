package com.example.android.musicapp_udacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the numbers category
        TextView SongAudio = (TextView) findViewById(R.id.SongAudio);

        // Set a click listener on that View
        SongAudio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent SongAudioIntent = new Intent(MainActivity.this, ListOfSongsAlbum.class);

                // Start the new activity
                startActivity(SongAudioIntent);
            }
        });

        ImageView playlists = (ImageView) findViewById(R.id.click_button);

        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clickButton = new Intent(MainActivity.this,ListOfSongsAlbum.class);
                startActivity(clickButton);
            }
        });
    }
}
