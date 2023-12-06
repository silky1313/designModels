package io.silky;

public class Image {
    private String name;
    private int size;

    public Image(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}