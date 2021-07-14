package org.example.iterator.v5;

/**
 * @author MortonShaw
 * @date 2021/7/14 15:16
 */
class LinkedListSelf<E> implements CollectionSelf<E> {

    Node<E> head = null;
    Node<E> tail = null;

    private int index = 0;

    @Override
    public void add(E o) {
        Node<E> node = new Node<>(o);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public IteratorSelf<E> iterator() {
        return new LinkedListIterator();
    }

    private static class Node<E> {

        E o;

        Node<E> next;

        public Node(E o) {
            this.o = o;
        }

    }

    private class LinkedListIterator implements IteratorSelf<E> {

        private int currentIndex = 0;
        private Node<E> currentNode = null;

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }

        @Override
        public E next() {
            if (currentIndex == 0) {
                currentNode = head;
            } else {
                currentNode = currentNode.next;
            }
            currentIndex++;
            return currentNode.o;
        }

    }

}


