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
//        Create a Trie for the dictionary
        Trie dict = new Trie();
//        For each word in the dictionary,
        for (String word : dictionary) dict.insert(word);
//        insert it into the Trie
//
//        Create a Trie for the misspelled words
        Trie miss = new Trie();
        ArrayList<String> misspelled = new ArrayList<>();
//
//        for each word in text:
        for (String word : text) {
            if (!dict.lookup(word) && !miss.lookup(word)) {
                miss.insert(word);
                misspelled.add(word);
            }
        }
//        if not in dictionary Trie and
//        not in misspelled Trie
//        add to misspelled Trie
        return misspelled.toArray(new String[0]);
    }
}
