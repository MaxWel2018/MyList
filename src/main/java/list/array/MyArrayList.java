package list.array;


import list.List;

public class MyArrayList<E> implements List<E>{
    private int capacity;
    private int defaultCapacity = 16;
    private int size = 0;
    private E[] array;

    public MyArrayList() {
        this.capacity = defaultCapacity;
        this.array = (E[]) new Object[capacity];

    }

    public MyArrayList(int capacity) {
        if (capacity >0) {
            this.capacity = capacity;
            this.array = (E[]) new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
    }

    public void add(E element) {
        if (size < capacity) {
            this.array[this.size++] = element;
        } else {
            E[] tempArray = this.array;
            this.capacity = (capacity * 3) / 2 + 1;
            this.array = (E[]) new Object[capacity];
            System.arraycopy(this.array, 0, tempArray, 0, this.size);
            this.array[this.size++] = element;
        }
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int size() {
        return size;
    }



    public E getByIndex(int index) {
        if (index >= 0) {
            if (array[index] != null) {
                return  array[index];
            }
        }
        throw new IllegalArgumentException("Index must be greater than 0");

    }


    public boolean remove(E element) {
        if (element == null) {
            throw new IllegalArgumentException("Element must not equal null");
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                array[i] = null;
                System.arraycopy(this.array,i, this.array,i+1,this.size-i);
                return true;
            }
        }
        return false;

    }


}
