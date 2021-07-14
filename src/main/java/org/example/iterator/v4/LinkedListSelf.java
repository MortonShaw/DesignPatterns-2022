package org.example.iterator.v4;

/**
 * @author MortonShaw
 * @date 2021/7/14 15:16
 */
class LinkedListSelf implements CollectionSelf {

    Node head = null;
    Node tail = null;

    private int index = 0;

    @Override
    public void add(Object o) {
        Node node = new Node(o);
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
    public IteratorSelf iterator() {
        return new LinkedListIterator();
    }

    private class Node {

        Object o;

        Node next;

        public Node(Object o) {
            this.o = o;
        }

    }

    private class LinkedListIterator implements IteratorSelf {

        private int currentIndex = 0;
        private Node currentNode = null;

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }

        @Override
        public Object next() {
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


