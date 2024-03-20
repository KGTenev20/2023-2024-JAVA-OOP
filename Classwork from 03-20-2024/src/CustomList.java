import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CustomList<T> implements GenericInterface<T>, Iterable<T> {

    private List<T> elements;

    public CustomList() {
        elements = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        this.elements.add(element);
    }

    @Override
    public void remove (T element) {
        return this.elements.remove(element);
    }

    @Override
    public T get(int index) {
        return this.elements.get(index);
    }



    @Override
    public Iterator<T> iterator() {
        CustomListIterator iterator = new CustomListIterator();
        return iterator();
    }

    private class CustomListIterator implements Iterator<T>{
        private int index = 0;

        @Override
        public boolean hasNext(){
            return index < elements.size();
        }

        @Override
        public T next(){
            T element = elements.get(index);
            index+=2;
            return element;
        }
    }
}