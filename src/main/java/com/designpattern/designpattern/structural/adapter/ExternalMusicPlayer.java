package com.designpattern.designpattern.structural.adapter;

public class ExternalMusicPlayer implements AdvanceMusicPlayer{
    @Override
    public void playAdvanceMusic(String filename) {
        System.out.println("External music player"+filename);
    }
}
