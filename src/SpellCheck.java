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
        // Hashed Way: fastest I've found
        // Turns the dictionary into a Hashset
        Set<String> dictionary_v2 = new HashSet<>(Arrays.asList(dictionary));
        // Creates Hash Set to hold misspelled words, but as a linked one to maintain the order of the added words
        Set<String> misspelled = new LinkedHashSet<>();
        // Checks if the dictionary contains a given word for each word in the given text, adds to misspelled if not
        for (String word : text) if (!dictionary_v2.contains(word)) misspelled.add(word);
        // Returns the array version of misspelled
        return misspelled.toArray(new String[0]);

        // Linear and Iterative Way coming next

    }
}
