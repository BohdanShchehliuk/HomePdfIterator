package Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);
        System.out.println("Iterator");
       Iterator <Integer> iterator = list.iterator();
       while (iterator.hasNext()) {
           System.out.println(iterator.next());
       }
       System.out.println("ListIterator"); // попробувати
           ListIterator <Integer> iterator1 = list.listIterator();
           while (iterator1.hasNext()){
               iterator1.add(10);
               System.out.println(iterator1.next());
           }
           System.out.println(list);
       }
    }


