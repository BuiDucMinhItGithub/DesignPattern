package com.designpattern.designpattern.adapter;

public class Music implements MusicPlayer{
    @Override
    public void playMusic(String name) {
        System.out.println("Music normal"+name);
    }
}
