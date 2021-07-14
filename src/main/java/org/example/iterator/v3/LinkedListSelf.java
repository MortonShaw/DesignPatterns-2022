package org.example.iterator.v3;

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

    private static class Node {

        Object o;

        Node next;

        public Node(Object o) {
            this.o = o;
        }

    }

}


