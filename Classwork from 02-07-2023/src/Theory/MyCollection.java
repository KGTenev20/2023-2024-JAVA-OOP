package Theory;

import Theory.GenericInterface;

// parametarizirame interface-a i class-a
public class MyCollection<T> implements GenericInterface<T> {
    @Override
    public void add(T number) {

    }

    @Override
    public void remove(T number) {

    }

    @Override
    public T get(int index) {
        return null;
    }
}