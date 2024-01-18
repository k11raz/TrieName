import java.util.HashMap;
public class Node {

    char letter;
    int letterCount;
    HashMap<Character, Node> children;

    Node(char letter) {
        this.letter = letter;
        letterCount = 0;
        children = new HashMap<>();
    }
}
