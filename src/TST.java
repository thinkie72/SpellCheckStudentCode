// By Tyler Hinkie in October 2024
public class TST {
    // Instance Variables
    private TSTNode root;

    // Constructor
    public TST() {
        root = null;
    }

    // Methods

    // Insertion starter method to call recursive method to insert a word into the TST and initialize root
    public void insert(String word) {
        // Initializes root and begins recursive algorithm
        root = insert(root, word, 0);
    }

    // Recursive method to run insertion on a word, continuing to add letters down the tree for every letter
    private TSTNode insert(TSTNode node, String word, int index) {
        // Initializes current letter for comparisons
        char letter = word.charAt(index);
        if (node == null) node = new TSTNode(letter);
        // Initializes left node if the letter is before the checked letter in the alphabet
        if (letter < node.getLetter()) node.setLeft(insert(node.getLeft(), word, index));
        // Initializes right node if the letter is after the checked letter in the alphabet
        else if (letter > node.getLetter()) node.setRight(insert(node.getRight(), word, index));
        // Initializes the node as the end of a word if it's the last letter in the word
        else if (index == word.length() - 1) node.setWord();
        // Initializes middle node if the letter comes after the checked letter in the giver word
        else node.setMiddle(insert(node.getMiddle(), word, index + 1));
        return node;
    }

    // Lookup starter method
    public boolean lookup(String word) {
        return lookup(root, word, 0);
    }

    // Lookup recursive helper method to determine whether or not the word is in the dictionary
    private boolean lookup(TSTNode node, String word, int index) {
        // The word doesn't exist if the next letter isn't in the TST
        if (node == null) return false;
        // Initializes current letter for comparisons
        char letter = word.charAt(index);
        // Looks to left node if the next letter comes before the checked letter in the alphabet
        if (letter < node.getLetter()) return lookup(node.getLeft(), word, index);
        // Looks to right node if the next letter comes after the checked letter in the alphabet
        else if (letter > node.getLetter()) return lookup(node.getRight(), word, index);
        // Returns whether or not the last letter is a word if we get that far
        else if (index == word.length() - 1) return node.isWord();
        // Move to next letter if that letter is correct
        return lookup(node.getMiddle(), word, index + 1);
    }
}
