package com.example.android.musicapp_udacity;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;

import java.util.ArrayList;


public class ListOfSongsAlbum extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_songs_album);

        ImageButton backbt = findViewById(R.id.backbutton);

        backbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(ListOfSongsAlbum.this, MainActivity.class);
                startActivity(playerIntent);
            }
        });
        int[] albumImages = new int[]{
                R.drawable.enrique,
                R.drawable.suit,
                R.drawable.yeahbaby,
                R.drawable.papakehteh,
        };

        ArrayList<Song> Songs = new ArrayList<>();
        Songs.add(new Song("Enrique Iglesias", "HERO", albumImages[0], "HERO"));
        Songs.add(new Song("Guru Randhawa", "Suit", albumImages[1], "Suit"));
        Songs.add(new Song("Garry Sandhu", "Yeah Baby", albumImages[2], "Yeah Baby"));
        Songs.add(new Song("Udit Narayan", "Papa Kehte Hain", albumImages[3], "Papa Kehte Hain"));

        SongAdapter adapter = new SongAdapter(this, Songs);
        GridView listView = findViewById(R.id.gridView);
        listView.setAdapter(adapter);

    }


    }
