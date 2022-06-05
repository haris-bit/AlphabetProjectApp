package com.example.alphabetproject;

public class Alphabet {
    private int imageId;
    private String letter;


    public Alphabet(int imageId, String letter) {
        this.imageId = imageId;
        this.letter = letter;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
