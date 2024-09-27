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
        // Hashed Way: fastest I've found (649 ms)
        // Turns the dictionary into a Hashset
        Set<String> dictionary_v2 = new HashSet<>(Arrays.asList(dictionary));
        // Creates Hash Set to hold misspelled words, but as a linked one to maintain the order of the added words
        Set<String> misspelled = new LinkedHashSet<>();
        // Checks if the dictionary contains a given word for each word in the given text, adds to misspelled if not
        for (String word : text) if (!dictionary_v2.contains(word)) misspelled.add(word);
        // Returns the array version of misspelled
        return misspelled.toArray(new String[0]);

//        // Linear, Iterative Way (so slow I got bored from watching it load)
//        ArrayList<String> misspelled = new ArrayList<>();
//        for (String possible : text) {
//            for (String confirmed : dictionary) {
//                if (possible.equals(confirmed) && !misspelled.contains(possible)) {
//                    misspelled.add(possible);
//                }
//            }
//        }
//        return mispelled.toArray(new String[0]);

//        // Linear, Iterative Way v2 (5 min 12 sec w/ 3 timeouts)
//        ArrayList<String> dict = new ArrayList<>(Arrays.asList(dictionary));
//        ArrayList<String> misspelled = new ArrayList<>();
//        for (String possible : text)
//            if (dict.contains(possible) && !misspelled.contains(possible)) misspelled.add(possible);
//        return mispelled.toArray(new String[0]);
    }
}
