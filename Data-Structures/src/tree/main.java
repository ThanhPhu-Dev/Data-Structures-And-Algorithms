package tree;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(7);
        tree.add(1);
        tree.add(0);
        tree.add(3);
        tree.add(2);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(9);
        tree.add(8);
        tree.add(10);
        Iterator traverse = tree.traverse(TreeTraverseType.POST_ORDER);
        while (traverse.hasNext()) {
            System.out.print(traverse.next()+" ");
        }

//        System.out.println(tree.height());
//        System.out.println(tree.size());
//        System.out.println(tree.contains(13));
//
//        tree.remove(6);
//        System.out.println(tree.isEmpty());
    }
}
