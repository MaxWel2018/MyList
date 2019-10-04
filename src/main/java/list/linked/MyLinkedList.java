package list.linked;

import list.List;


public class MyLinkedList<E> implements List<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;
    private int index = 0;

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;

        Node(E element) {
            this.element = element;
        }


    }

    public Node<E> getNextElement(Node<E> current) {
        return current.next;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(E element) {
        Node newNode = new Node(element);
        if (first == null) {
            newNode.next = null;
            newNode.previous = null;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
    }

    public E getByIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Dont correct index");
        }
        Node<E> result =first;

        for (int i = 0; i < index; i++) {
            result = getNextElement(result);
        }
        return result.element;
    }

    public boolean remove(E element) {
        if (element == null) {
            throw new IllegalArgumentException("Element ==null");
        }
        Node<E> result = first.next;

        for (int i = 0; i < size; i++) {
            if (result == last) {
                return false;
            }
            if (result.element.equals(element)) {
                result.previous.next = result.next;
                result.next.previous = result.previous;
                result = null;
                return true;
            }
            result = getNextElement(result);
        }
        return false;
    }
}
