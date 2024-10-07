import java.util.*;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Tyler Hinkie
 * */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all misspelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        // Create a Trie for the dictionary
        Trie dict = new Trie();
        // Insert each word in the dictionary into the trie version
        for (String word : dictionary) dict.insert(word);
        // Create a Trie for the misspelled words
        Trie miss = new Trie();
        // Separate ArrayList for misspelled words b/c it is hard to convert Trie to an array of words
        ArrayList<String> misspelled = new ArrayList<>();
        for (String word : text) {
            // Add word to both the Trie and ArrayList if it isn't in dictionary and isn't already in the miss Trie
            if (!dict.lookup(word) && !miss.lookup(word)) {
                miss.insert(word);
                misspelled.add(word);
            }
        }
        // Return converted ArrayList
        return misspelled.toArray(new String[0]);
//        // Create a TST for the dictionary
//        TST dict = new TST();
//        // Insert each word in the dictionary into the trie version
//        for (String word : dictionary) dict.insert(word);
//        // Create a Trie for the misspelled words
//        TST miss = new TST();
//        // Separate ArrayList for misspelled words b/c it is hard to convert Trie to an array of words
//        ArrayList<String> misspelled = new ArrayList<>();
//        for (String word : text) {
//            // Add word to both the Trie and ArrayList if it isn't in dictionary and isn't already in the miss Trie
//            if (!dict.lookup(word) && !miss.lookup(word)) {
//                miss.insert(word);
//                misspelled.add(word);
//            }
//        }
//        // Return converted ArrayList
//        return misspelled.toArray(new String[0]);
    }
}
