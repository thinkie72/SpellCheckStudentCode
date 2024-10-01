// By Tyler Hinkie in September and October 2024
public class Node {
    // Instance variables
    private boolean isWord;
    private Node[] next;

    // Constructor
    public Node() {
        isWord = false;
        next = new Node[27];
    }

    // Methods
    public boolean isWord() {return isWord;}
    public void setWord() {isWord = true;}
    public Node[] getNext () {return next;}
}
