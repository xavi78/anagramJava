package com.geekshubsacademy.controllers;

import com.geekshubsacademy.helpers.Anagram;
import com.geekshubsacademy.helpers.ReadProcess;
import com.geekshubsacademy.models.AnagramModel;
import com.geekshubsacademy.views.MainView;

import java.util.ArrayList;

public class AnagramController {

    private ArrayList<String> aList;
    public AnagramController()
    {
        this.aList = ReadProcess.readerDocument();
    }

    public void  checkAnagram()
    {

        MainView mainView = new MainView();
        String word = mainView.show();


        Anagram anagram = new Anagram();
        for( int i= 0; i<aList.size();i++) {
            AnagramModel anagramModel = new AnagramModel(aList.get(i));
              if (anagram.isAnagram(anagramModel.getAnagram(),word ))
                  System.out.println(anagramModel.toString() + " ->true");


        }

    }
}
