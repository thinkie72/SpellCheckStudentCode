public class TST {
    // Instance Variables
    private TSTNode root;

    // Constructor
    public TST() {
        root = new TSTNode();
    }

    // Methods
    public void insert(String word) {
        root = insert(root, word.toCharArray(), 0);
    }

    private TSTNode insert(TSTNode n, char[] letters, int index) {
        if (index >= letters.length) return n;
        char c = letters[index];
        if (n == null) {
            n = new TSTNode();
            n.setLetter(c);
        }
        if (index + 1 == letters.length) n.setWord();
        if (c < n.getLetter()) n.getNext()[0] = insert(n.getNext()[0], letters, index);
        else if (c > n.getLetter()) n.getNext()[2] = insert(n.getNext()[2], letters, index);
        else n.getNext()[1] = insert(n.getNext()[1], letters, index + 1);
        return n;
    }

    public boolean lookup(String word) {
        return lookup(root, word.toCharArray(), 0);
    }

    private boolean lookup(TSTNode n, char[] letters, int index) {

    }
}
