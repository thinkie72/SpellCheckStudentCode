// By Tyler Hinkie in October 2024
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

    private TSTNode insert(TSTNode node, char[] letters, int index) {
        if (index >= letters.length) return node;
        char letter = letters[index];
        if (node == null) {
            node = new TSTNode();
            node.setLetter(letter);
        }
        if (letter < node.getLetter()) node.getNext()[0] = insert(node.getNext()[0], letters, index);
        else if (letter > node.getLetter()) node.getNext()[2] = insert(node.getNext()[2], letters, index);
        else if (index + 1 == letters.length) node.setWord();
        else node.getNext()[1] = insert(node.getNext()[1], letters, index + 1);
        return node;
    }

    public boolean lookup(String word) {
        return lookup(root, word.toCharArray(), 0);
    }

    private boolean lookup(TSTNode node, char[] letters, int index) {
        if (index >= letters.length) return false;
        char letter = letters[index];
        if (node == null) {
            node = new TSTNode();
            node.setLetter(letter);
        }
        if (letter < node.getLetter()) return lookup(node.getNext()[0], letters, index);
        else if (letter > node.getLetter()) return lookup(node.getNext()[2], letters, index);
        else if (index + 1 == letters.length) return node.isWord();
        return lookup(node.getNext()[1], letters, index + 1);
    }
}
