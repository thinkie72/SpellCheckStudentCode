// By Tyler Hinkie in September and October 2024
public class Trie {
    // Instance variables
    private TrieNode root;

    // Constructor
    public Trie() {
        root = new TrieNode();
    }

    // Methods
    public void insert(String s) {;
        TrieNode n = root;
        for (char c : s.toCharArray()) {
            if (n.getNext()[c] == null) {
                n.getNext()[c] = new TrieNode();
            }
            n = n.getNext()[c];
        }
        n.setWord();
    }
    public boolean lookup(String s) {
        TrieNode n = root;
        for (char c : s.toCharArray()) {
            if (n.getNext()[c] == null) {
                return false;
            }
            n = n.getNext()[c];
        }
        return n.isWord();
    }
}
