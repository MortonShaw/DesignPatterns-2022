package org.example.proxy2.v2;

/**
 * 深克隆
 *
 * @author MortonShaw
 * @date 2021/7/15 9:34
 */
class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p1.location);
        System.out.println(p2.location);

        System.out.println(p1.location == p2.location);
        p1.location.street = "shanghai";
        System.out.println(p1.location);
        System.out.println(p2.location);
    }

}

class Person implements Cloneable {

    int age = 8;
    int score = 100;

    Location location = new Location(new String("beijing"), 22);

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.location = (Location) location.clone();
        return p;
    }

}

class Location implements Cloneable {

    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
