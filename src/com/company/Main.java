package com.company;
/*
 * Classname : Arrays
 *
 * 31 May 2020
 *
 * Copyright Vasylkivska Kateryna KNTEU
 *
 * Module 1 task 2
 *
 * 1.  Find in the net and download a text version of a novel about
   Harry Potter.  For instance, "Harry Potter and the Sorcerer's Stone".
   2. Split the novel into an array of words.
   3. Clean the words from a punctuation signs.
   4. Create another array containing distinct words.
   5. Order the words in alphabetic order.
 */


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

//      Download the text
        String harry = new String(Files.readAllBytes(Paths.get
                ("/Users/Kate/Downloads/harry.txt")));
//____________________________________________________________________

//        Cleaning the text from a punctuation marks
        harry = harry.replaceAll("[^a-zA-Z0-9 ]", "")
                .toLowerCase();
//____________________________________________________________________

//        Split the novel into an array of words
        String[] harryWords = harry.split(" ");
        for (int i = 0; i < harryWords.length; i++) {
            System.out.println(harryWords[i]);

        }
//____________________________________________________________________

//      Create another array containing distinct words.

        String[] words = harry.split("\\W+");

        String distinktString = " ";

        for (int i = 0; i < words.length; i++) {

            if (!distinktString.contains(words[i])) {
                distinktString += words[i] + " ";
            }
        }
//____________________________________________________________________

//        Order the words in alphabetic order.
        System.out.println(distinktString);
        String[] distrinctArray = distinktString.split(" ");
        Arrays.sort(distrinctArray);

        for (int i = 0; i < distrinctArray.length; i++) {
            System.out.println(distrinctArray[i]);
        }

    }
}
