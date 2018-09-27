package com.geekshubsacademy.models;

public class AnagramModel {


    private String anagram;

    public AnagramModel(String anagram) {
        this.anagram = anagram;
    }

    public String getAnagram() {
        return anagram;
    }

    public void setAnagram(String anagram) {
        this.anagram = anagram;
    }

    @Override
    public String toString() {
        return "AnagramModel{" +
                "anagram='" + anagram + '\'' +
                '}';
    }



}

