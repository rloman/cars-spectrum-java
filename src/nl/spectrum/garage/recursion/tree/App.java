package nl.spectrum.garage.recursion.tree;

public class App {

    // assignment for Tree.
    // 1) print postorder
    // 2) implement boolean contains(Object);

    // volgende keer.

    // Graph Theory. Vind een route van Almelo naar Breda bijvoorbeeld ...
    // Depth First Search.
    // Breadth First Search.
    // Dijkstra's Algorithm. SPSP. 
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(5);
        tree.add(3);
        tree.add(17);

        tree.print();

        System.out.println(tree.size() == 3);
    }
}
