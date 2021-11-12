package array;

import java.util.Iterator;

public class main {

    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(11);
        array.add(12);
        System.out.println(array.size());
        System.out.println(array.toString());

        array.set(0, -1);
        System.out.println(array.get(0));


        array.removeAt(1);
        array.remove(4);
        Iterator iterator = array.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        array.clear();
        System.out.println(array.isEmpty());
        System.out.println(array.toString());

    }
}
