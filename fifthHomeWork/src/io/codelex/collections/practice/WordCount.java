package io.codelex.collections.practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

public class WordCount {
    private static final String file = "fifthHomeWork/src/io/codelex/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        int wordCount = 0;
        int characterCount = 0;
        int lineCount = 0;

        while ((line = bufferedReader.readLine()) != null) {
            characterCount += line.length();
            String[] words = line.split("\\s+");
            wordCount += words.length;
            String[] sentence = line.split("\\r?\\n");
            lineCount += sentence.length;
        }
        System.out.println("Words = " + wordCount);
        System.out.println("Lines = " + lineCount);
        System.out.println("Chars = " + characterCount);
    }
}
