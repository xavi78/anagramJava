package com.geekshubsacademy.helpers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadProcess {

    public static ArrayList<String> readerDocument(){

        ArrayList<String> loadFile = new ArrayList<>();
        FileReader fileReader;
        fileReader= null;
        try{
            File file = new File("wordlist.txt")
                    .getCanonicalFile();
            fileReader = new FileReader(file);

            BufferedReader buffer = new BufferedReader(fileReader);
            String line;
            while((line = buffer.readLine()) != null){
                 loadFile.add(line);
            }

        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return loadFile;


    }
}
