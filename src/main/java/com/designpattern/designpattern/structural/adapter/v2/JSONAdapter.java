package com.designpattern.designpattern.structural.adapter.v2;

public class JSONAdapter implements FileReader{

    private final JSONReader jsonReader;

    public JSONAdapter(JSONReader jsonReader) {
        this.jsonReader = jsonReader;
    }

    @Override
    public void readFile(String fileName) {
        jsonReader.readJsonFile(fileName);
    }
}
