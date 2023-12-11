package com.example.myapplication2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
        @Test
        public void countChar_regular()
        {
            String InputString = "hello";
            int expected = 5;
            int actual = WordCounter.countCharacters(InputString);
            assertEquals(expected,actual);

        }
        @Test
        public void countChar_blankSpace_and_words()
        {
            String InputString = "Mobile Development Techniques";
            int expected = 29;
            int actual = WordCounter.countCharacters(InputString);
            assertEquals(expected,actual);

        }
        @Test
        public void countChar_specialCharacter()
        {
            String InputString = "ЇЪtr";
            int expected = 4;
            int actual = WordCounter.countCharacters(InputString);
            assertEquals(expected,actual);
        }
        @Test
        public void countChar_blankSpace()
        {
            String InputString ="Unit test for the\n" +
                    "second lab\n" +
                    "words and chars counter";
            int expected = 52;
            int actual = WordCounter.countCharacters(InputString);
            assertEquals(expected,actual);
        }

        @Test
        public void countChar_REALblankSpace()
        {
            String InputString =" ";
            int expected = 1;
            int actual = WordCounter.countCharacters(InputString);
            assertEquals(expected,actual);

        }
        @Test
        public void countChar_numbers()
        {
            String InputString ="46732";
            int expected = 5;
            int actual = WordCounter.countCharacters(InputString);
            assertEquals(expected,actual);

        }
        @Test
        public void countWord_oneWord()
        {
            String InputString = "hello";
            int expected = 1;
            int actual = WordCounter.countWords(InputString);
            assertEquals(expected,actual);

        }
        @Test
        public void countWord_Multiple_word()
        {
            String InputString = "Unit test for the second lab";
            int expected = 6;
            int actual = WordCounter.countWords(InputString);
            assertEquals(expected,actual);
        }
        @Test
        public void countWord_Special_letters()
        {
            String InputString = "Special letters Їet";
            int expected = 3;
            int actual = WordCounter.countWords(InputString);
            assertEquals(expected,actual);
        }
        @Test
        public void countWord_split_w_other_punctuation() {
            String InputString = "Working.On.unit.test";
            int expected = 4;
            int actual = WordCounter.countWords(InputString);
            assertEquals(expected, actual);
        }
    }