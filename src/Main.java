public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertName("Ali");
        trie.insertName("İrfan");
        trie.insertName("Ayse");
        trie.insertName("Alican");
        trie.insertName("Alihan");
        trie.updateName("Alihan", "Veli");
        trie.visualizeTree();
    }
}