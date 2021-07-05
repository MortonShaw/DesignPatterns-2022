package org.example.strategy;

/**
 * @author MortonShaw
 * @date 2021/7/5 15:34
 */
public class CatHeightComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getHeight() > o2.getHeight()) {
            return -1;
        } else if (o1.getHeight() < o2.getHeight()) {
            return 1;
        } else {
            return 0;
        }
    }

}
