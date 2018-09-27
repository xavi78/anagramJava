package com.geekshubsacademy.test;

import com.geekshubsacademy.helpers.Anagram;
import com.geekshubsacademy.controllers.AnagramController;
import com.geekshubsacademy.helpers.ReadProcess;
import com.geekshubsacademy.views.MainView;

import java.util.ArrayList;

public class Test {

    public static void anagramTest(){
        Anagram anagram = new Anagram();
        String word1 = "casa";
        String word2 = "saca";
        System.out.println(anagram.isAnagram(word1, word2));

    }

    public static void readFileTest(){
      ArrayList<String> aList = new ArrayList<>();
      aList = ReadProcess.readerDocument();
      System.out.println(aList.size());

    }

    public static void testAnagramController()
    {
        AnagramController anagramController = new AnagramController();
        anagramController.checkAnagram();
    }

    public static void testMainView(){
        MainView mainView = new MainView();
        mainView.show();
    }
    public static void main(String[] args) {
       //anagramTest();
       //readFileTest();
        testAnagramController();
        //testMainView();
    }
}
