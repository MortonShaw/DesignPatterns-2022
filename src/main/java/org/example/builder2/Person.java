package org.example.builder2;

/**
 * @author MortonShaw
 * @date 2021/7/14 19:23
 */
public class Person {

    int id;
    String name;
    int age;
    double weight;
    int score;
    Location location;

    private Person() {

    }

    static PersonBuilder personBuilder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private PersonBuilder() {

        }

        Person p = new Person();

        PersonBuilder basicInfo(int id, String name, int age) {
            p.id = id;
            p.name = p.name;
            p.age = p.age;
            return this;
        }

        PersonBuilder weight(double weight) {
            p.weight = weight;
            return this;
        }

        PersonBuilder score(int score) {
            p.score = score;
            return this;
        }

        PersonBuilder location(String street, String roomNo) {
            p.location = new Location(street, roomNo);
            return this;
        }

        public Person build() {
            return p;
        }
    }

}

class Location {

    String street;
    String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}
