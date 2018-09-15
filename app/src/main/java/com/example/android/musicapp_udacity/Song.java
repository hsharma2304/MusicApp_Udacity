package com.example.android.musicapp_udacity;

public class Song {

    private String mArtist;
    private String mAlbumTitle;
    private int mAlbumImage;
    private String mSong;


    public Song(String vArtist, String vAlbumTitle, int vAlbumImage, String vSong) {

        mArtist = vArtist;
        mAlbumTitle = vAlbumTitle;
        mAlbumImage = vAlbumImage;
        mSong = vSong;
    }
    public String getArtist() {
        return mArtist;
    }

    public String getAlbumTitle() {
        return mAlbumTitle;
    }

    public int getAlbumImage() {
        return mAlbumImage;
    }

    public String getSong() {
        return mSong;
    }


}
