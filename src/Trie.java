// By Tyler Hinkie in September and October 2024
public class Trie {
    // Instance variables
    private Node root;

    // Constructor
    public Trie() {
        root = new Node();
    }

    // Methods
    public void insert(String s) {;
        Node n = root;
        for (char c : s.toCharArray()) {
            if (n.getNext()[c] == null) {
                n.getNext()[c] = new Node();
            }
            n = n.getNext()[c];
        }
        n.setWord();
    }
    public boolean lookup(String s) {
        Node n = root;
        for (char c : s.toCharArray()) {
            if (n.getNext()[c] == null) {
                return false;
            }
            n = n.getNext()[c];
        }
        return n.isWord();
    }
    public void printTrie() {

    }


}
