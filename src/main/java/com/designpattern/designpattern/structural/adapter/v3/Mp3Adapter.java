package com.designpattern.designpattern.structural.adapter.v3;

public class Mp3Adapter implements MediaPlayer{

    private final AdvanceMediaPlayer advanceMediaPlayer;

    public Mp3Adapter(AdvanceMediaPlayer advanceMediaPlayer) {
        this.advanceMediaPlayer = advanceMediaPlayer;
    }


    @Override
    public void playMusic() {
        advanceMediaPlayer.play();
    }
}
