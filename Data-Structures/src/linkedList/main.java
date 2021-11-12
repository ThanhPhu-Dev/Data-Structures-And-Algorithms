package linkedList;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        DefaultDoublyLinkedList<Integer> linkedList = new DefaultDoublyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());

        System.out.println(linkedList.contains(4));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.toString());

        linkedList.removeAt(0);
        linkedList.removeAt(3);
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }

        linkedList.clear();
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.toString());
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }



    }
}
