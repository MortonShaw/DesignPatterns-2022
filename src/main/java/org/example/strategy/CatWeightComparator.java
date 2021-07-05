package org.example.strategy;

/**
 * @author MortonShaw
 * @date 2021/7/5 15:34
 */
public class CatWeightComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else {
            return 0;
        }
    }

}
