// By Tyler Hinkie in September and October 2024
public class Trie {
    // Instance variables
    private Node root;

    // Constructor
    public Trie() {
        root = new Node();
    }

    // Methods
    public int charToIndex(char c) {
        if (c == 39) return 26;
        return c - 'a';
    }
    public void insert(String s) {;
        Node n = root;
        int i;
        for (char c : s.toCharArray()) {
            i = charToIndex(c);
            if (n.getNext()[i] == null) {
                n.getNext()[i] = new Node();
            }
            n = n.getNext()[i];
        }
        n.setWord();
    }
    public boolean lookup(String s) {
        Node n = root;
        int i;
        for (char c : s.toCharArray()) {
            i = charToIndex(c);
            if (i < 0 || i >= 27 || n.getNext()[i] == null) {
                return false;
            }
            n = n.getNext()[i];
        }
        return n.isWord();
    }
    public void printTrie() {

    }


}
