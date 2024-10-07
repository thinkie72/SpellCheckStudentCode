// By Tyler Hinkie in October 2024
public class TSTNode {
    // Instance Variables
    private char letter;
    private boolean isWord;
    private TSTNode left, middle, right;

    // Constructor
    public TSTNode(char letter) {
        isWord = false;
        this.letter = letter;
    }

    // Methods (all accessors and mutators)
    public char getLetter() {
        return letter;
    }

    public TSTNode getLeft() {
        return left;
    }

    public void setLeft(TSTNode left) {
        this.left = left;
    }

    public TSTNode getMiddle() {
        return middle;
    }

    public void setMiddle(TSTNode middle) {
        this.middle = middle;
    }

    public TSTNode getRight() {
        return right;
    }

    public void setRight(TSTNode right) {
        this.right = right;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord() {
        isWord = true;
    }
}
