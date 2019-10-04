package list;

public interface List<E> {
    boolean isEmpty();

    int size();

    void add(E element);

    E getByIndex(int index);

    boolean remove(E element);


}
