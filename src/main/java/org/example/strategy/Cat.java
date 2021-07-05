package org.example.strategy;

/**
 * @author MortonShaw
 * @date 2021/7/5 14:33
 */
public class Cat implements Comparable<Cat> {

    private int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.weight < cat.getWeight()) {
            return -1;
        } else if (this.weight > cat.getWeight()) {
            return 1;
        } else {
            return 0;
        }
    }

}
