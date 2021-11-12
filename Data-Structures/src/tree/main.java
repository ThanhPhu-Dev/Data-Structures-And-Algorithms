package tree;

public class main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(15);
        tree.add(13);
        tree.add(20);
        tree.add(14);
        tree.add(17);
        tree.add(22);
        tree.add(11);
        tree.add(8);
        tree.add(5);
        tree.add(21);
        tree.add(18);

        System.out.println(tree.height());
        System.out.println(tree.size());
        System.out.println(tree.contains(13));

        tree.remove(6);
        System.out.println(tree.isEmpty());
    }
}
