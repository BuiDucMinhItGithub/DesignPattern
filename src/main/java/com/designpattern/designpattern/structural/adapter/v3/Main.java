package com.designpattern.designpattern.structural.adapter.v3;

public class Main {
    public static void main(String[] args) {
        Mp3Adapter mp3Adapter = new Mp3Adapter(new Mp4Adapter());
        mp3Adapter.playMusic();

        Mp3Adapter mp3Adapter2 = new Mp3Adapter(new CDAdapter());
        mp3Adapter2.playMusic();
    }
}
