class Trie {
    Node root;

    public Trie() {
        root = new Node(' ');
    } // created root

    void insertName(String name) {
        name = name.toUpperCase();

        Node current = root;
        for (char letter : name.toCharArray()) {
            Node child = current.children.get(letter);
            if (child == null) {
                child = new Node(letter); // a new node created for each letter
                current.children.put(letter, child); // editing below the existing node
            }
            current = child;
            current.letterCount++;
        }
        //System.out.println("The name " + name + " added in the tree.");
    }

    void deleteName(String name) {
        name = name.toUpperCase();

        Node current = root;
        for (char letter : name.toCharArray()) {
            Node child = current.children.get(letter);
            if (child == null) {
                return; // there's no name
            }
            child.letterCount--;
            if (child.letterCount == 0) {
                current.children.remove(letter); // letterCount = 0 deleted from trie
                return;
            }
            current = child;
        }
    }

    void updateName(String oldName, String newName) {

        oldName = oldName.toUpperCase();
        newName = newName.toUpperCase();

        deleteName(oldName);
        insertName(newName);
        //System.out.println("The name " + oldName + " replaced with " + newName);
    }


    void visualizeTree() {
        visualize(root, "");
    }

    void visualize(Node node, String prefix) {
        if (node == null) return;

        System.out.println(prefix + node.children.get(node) + "(" + node.letterCount + ")");

        for (Node child : node.children.values()) {
            visualize(child, prefix + " -> "); // recursive
        }
    }

}
