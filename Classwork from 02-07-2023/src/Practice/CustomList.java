package Practice;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// za getMax and getMin e Comparable
public class CustomList<T extends Comparable<T>> {
    List<T> myList;

    public CustomList() {
        myList = new ArrayList<>();
    }

    public void add(T element) {
        myList.add(element);
    }

    public T remove(int index) {
        return myList.remove(index);
    }

    public boolean contains(T element) {
        return myList.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T firstElement = myList.get(firstIndex);
        T secondElement = myList.get(secondIndex);
        myList.add(firstIndex, secondElement);
        myList.add(secondIndex, firstElement);
    }

    public int countGreaterThan(T element) {
        int count = 0;


        for(int i = 0; i < myList.size(); i++) {
            if(myList.get(i).compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        // oshte edin nachin
        return Collections.max(myList);

//        int max = myList.get(0);
//
//        for(int i = 0; i < myList.size(); i++) {
//            if(myList.get(i) > max) {
//                max = myList.get(i);
//            }
//        }
//        return max;
    }

    public T getMin() {
        // oshte edin nachin
        return Collections.min(myList);

//        int min = myList.get(0);
//
//        for(int i = 0; i < myList.size(); i++) {
//            if(myList.get(i) < min) {
//                min = myList.get(i);
//            }
//        }
//        return min;
    }

    public void print() {
        // with Stream API
        myList.stream().forEach(e -> System.out.println(e));
    }
}