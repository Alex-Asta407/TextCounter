package com.example.myapplication2;

public class WordCounter {
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("[\\s,\\.]");
        return words.length;
    }

    public static int countCharacters(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.length();
    }
}
