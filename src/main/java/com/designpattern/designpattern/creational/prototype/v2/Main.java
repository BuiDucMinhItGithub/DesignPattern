package com.designpattern.designpattern.creational.prototype.v2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Song song = new Song("ABC", 12, "Minh");
        Song songClone = (Song) song.clone();
        System.out.println(songClone.equals(song));

    }
}
