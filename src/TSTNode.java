public class TSTNode {
    // Instance Variables
    private char letter;
    private boolean isWord;
    private TSTNode[] next;

    // Constructor
    public TSTNode() {
        isWord = false;
        next = new TSTNode[3];
    }

    // Methods
    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public TSTNode[] getNext() {
        return next;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord() {
        isWord = true;
    }
}
