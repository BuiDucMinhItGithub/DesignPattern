package com.designpattern.designpattern.structural.adapter.v1;

public class ExternalMusicPlayer implements AdvanceMusicPlayer{
    @Override
    public void playAdvanceMusic(String filename) {
        System.out.println("External music player"+filename);
    }
}
