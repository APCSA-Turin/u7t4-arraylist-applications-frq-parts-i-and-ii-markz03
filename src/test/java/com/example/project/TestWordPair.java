package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.project.WordPair.*;

public class TestWordPair {
    @Test
    public void testPARTA(){
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        String expected = "[(one, two), (one, three), (two, three)]";
        assertEquals(exampleOne.toString(),expected);
        assertEquals(exampleOne.getAllPairs().size(),3);

        String[] phrase = {new String("the"), "more", new String("the"), "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        String expected2 = "[(the, more), (the, the), (the, merrier), (more, the), (more, merrier), (the, merrier)]";
        assertEquals(exampleTwo.toString(),expected2);
        assertEquals(exampleTwo.getAllPairs().size(),6);

        String[] moreWords = {new String("the"), new String("red"), "fox", new String("the"), new String("red")};
        WordPairList exampleThree = new WordPairList(moreWords);
        String expected3 = "[(the, red), (the, fox), (the, the), (the, red), (red, fox), (red, the), (red, red), (fox, the), (fox, red), (the, red)]";
        assertEquals(exampleThree.toString(),expected3);
        assertEquals(exampleThree.getAllPairs().size(),10);
    }

    @Test
    public void testPARTB(){
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        assertEquals(exampleOne.numMatches(),0);


        String[] phrase = {new String("the"), "more", new String("the"), "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        assertEquals(exampleTwo.numMatches(),1);    

        String[] moreWords = {new String("the"), new String("red"), "fox", new String("the"), new String("red")};
        WordPairList exampleThree = new WordPairList(moreWords);
        assertEquals(exampleThree.numMatches(),2);      
    }

}
