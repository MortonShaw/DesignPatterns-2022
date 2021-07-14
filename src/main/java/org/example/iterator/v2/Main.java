package org.example.iterator.v2;

import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/14 14:55
 */
class Main {

    public static void main(String[] args) {
        LinkedListSelf linkedListSelf = new LinkedListSelf();
        for (int i = 0; i < 15; i++) {
            linkedListSelf.add(i);
        }
        System.out.println(linkedListSelf.size());
    }

}

class LinkedListSelf {

    Node head = null;
    Node tail = null;

    private int index = 0;

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

    int size() {
        return index;
    }

}

class Node {

    Object o;

    Node next;

    public Node(Object o) {
        this.o = o;
    }

}
