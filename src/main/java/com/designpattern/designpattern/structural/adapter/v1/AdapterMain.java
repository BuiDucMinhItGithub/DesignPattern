package com.designpattern.designpattern.structural.adapter.v1;

public class AdapterMain {

    public static void main(String[] args) {
        Music music = new Music();
        music.playMusic("Music");

        AdvanceMusicPlayer advanceMusicPlayer = new ExternalMusicPlayer();

        AdvanceMusicPlayerAdapter adapter = new AdvanceMusicPlayerAdapter(advanceMusicPlayer);
        adapter.playMusic("Advance music but play normal kind");
    }
}
