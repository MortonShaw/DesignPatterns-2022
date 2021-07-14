package org.example.iterator.v1;

/**
 * @author MortonShaw
 * @date 2021/7/12 21:42
 */
class Main {

    public static void main(String[] args) {
        ArrayListSelf arrayListSelf = new ArrayListSelf();
        for (int i = 0; i < 15; i++) {
            arrayListSelf.add(i);
        }
        System.out.println(arrayListSelf.size());
    }

}

class ArrayListSelf {

    Object[] objects = new Object[10];
    private int index = 0;

    public void add(Object o) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index++] = o;
    }

    public int size() {
        return index;
    }

}
