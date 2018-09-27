package com.geekshubsacademy.views;

import java.util.Scanner;

public class MainView {
    public String show(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a word to find:");
        String word = scanner.nextLine();
        scanner.close();
        return word;
    }
}
