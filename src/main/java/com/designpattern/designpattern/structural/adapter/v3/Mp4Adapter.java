package com.designpattern.designpattern.structural.adapter.v3;

public class Mp4Adapter implements AdvanceMediaPlayer{
    @Override
    public void play() {
        System.out.println("Play Mp4 music");
    }
}
