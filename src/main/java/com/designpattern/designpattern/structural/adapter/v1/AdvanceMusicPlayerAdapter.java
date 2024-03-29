package com.designpattern.designpattern.structural.adapter.v1;

public class AdvanceMusicPlayerAdapter implements MusicPlayer{
    private final AdvanceMusicPlayer advanceMusicPlayer;

    public AdvanceMusicPlayerAdapter(AdvanceMusicPlayer advanceMusicPlayer) {
        this.advanceMusicPlayer = advanceMusicPlayer;
    }


    @Override
    public void playMusic(String filename) {
        advanceMusicPlayer.playAdvanceMusic(filename);
    }
}
