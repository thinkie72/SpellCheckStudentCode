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
        Set<String> dict = new HashSet<>(Arrays.asList(dictionary));
        Set<String> misspelled = new HashSet<>();
        for (String word : text) {
            if (!dict.contains(word) && !misspelled.contains(word)) {
                misspelled.add(word);
            }
        }
        String[] arr = new String[misspelled.size()];
        return misspelled.toArray(arr);
    }
}
