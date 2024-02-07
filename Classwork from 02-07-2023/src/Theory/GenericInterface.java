package Theory;

public interface GenericInterface<T> {
    void add(T number);
    void remove(T number);

    // vinagi e int zatova nqma smisul da go promenqme
    T get(int index);
}