package com.designpattern.designpattern.structural.adapter.v1;

public class Music implements MusicPlayer{
    @Override
    public void playMusic(String name) {
        System.out.println("Music normal"+name);
    }
}
