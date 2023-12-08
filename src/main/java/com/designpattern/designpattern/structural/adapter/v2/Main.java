package com.designpattern.designpattern.structural.adapter.v2;

public class Main {
    public static void main(String[] args) {
        JSONReader jsonReader = new JSONReader();
        FileReader jsonAdapter = new JSONAdapter(jsonReader);
        jsonAdapter.readFile("data.json");

        XMLReader xmlReader = new XMLReader();
        FileReader xmlAdapter = new XMLAdapter(xmlReader);
        xmlAdapter.readFile("data.xml");
    }
}
