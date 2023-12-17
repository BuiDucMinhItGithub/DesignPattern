package com.designpattern.designpattern.structural.adapter.v3;

public class CDAdapter implements AdvanceMediaPlayer{
    @Override
    public void play() {
        System.out.println("Play cd music");
    }
}
