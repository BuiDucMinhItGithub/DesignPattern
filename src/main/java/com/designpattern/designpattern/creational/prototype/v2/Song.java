package com.designpattern.designpattern.creational.prototype.v2;

import com.designpattern.designpattern.creational.prototype.v1.Pen;

import java.util.Objects;

public class Song implements Cloneable{
    private String name;
    private int time;
    private String artist;

    public Song(String name, int time, String artist) {
        this.name = name;
        this.time = time;
        this.artist = artist;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return Objects.equals(song.name, name) && time == song.time && Objects.equals(artist, song.artist);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    protected Object clone() {
        try {
            return (Song) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
