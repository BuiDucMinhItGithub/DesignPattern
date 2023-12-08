package com.designpattern.designpattern.structural.adapter.v2;

public class XMLAdapter implements FileReader{

    private final XMLReader xmlReader;

    public XMLAdapter(XMLReader xmlReader) {
        this.xmlReader = xmlReader;
    }

    @Override
    public void readFile(String fileName) {
        xmlReader.readXMLFile(fileName);
    }
}
