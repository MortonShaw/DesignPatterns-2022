package org.example.iterator.v5;

/**
 * @author MortonShaw
 * @date 2021/7/14 15:15
 */
class ArrayListSelf<E> implements CollectionSelf<E> {

    Object[] objects = new Object[10];
    private int index = 0;

    @Override
    public void add(E o) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index++] = o;
    }

    @Override
    public IteratorSelf<E> iterator() {
        return new ArrayListIterator();
    }

    @Override
    public int size() {
        return index;
    }

    private class ArrayListIterator implements IteratorSelf<E> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }

        @Override
        public E next() {
            return (E) objects[currentIndex++];
        }

    }

}
