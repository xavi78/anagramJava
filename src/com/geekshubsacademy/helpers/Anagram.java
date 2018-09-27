package com.geekshubsacademy.helpers;

import java.util.Arrays;

public class Anagram {

    public  boolean  isAnagram(String word1, String word2)
    {

         char[] array1 = word1.toCharArray();
         char[] array2 = word2.toCharArray();

         Arrays.sort(array1);
         Arrays.sort( array2);

         return new String(array1).equals(new String(array2));
    }
}
