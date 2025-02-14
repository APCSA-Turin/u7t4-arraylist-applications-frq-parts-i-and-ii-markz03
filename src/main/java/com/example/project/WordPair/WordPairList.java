package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                WordPair pair = new WordPair(words[i], words[j]);
                allPairs.add(pair);
            }
        }
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int numMatches = 0;
        for (int i = 0; i < allPairs.size(); i++) {
            String word1 = allPairs.get(i).getFirst();
            String word2 = allPairs.get(i).getSecond();
            if (word1.equals(word2)) {
                numMatches++;
            }
        }
        return numMatches;
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
