package org.example.proxy2.v3;

/**
 * String是深克隆，不管是直接量还是new，new肯定不是一个对象
 *
 * @author MortonShaw
 * @date 2021/7/15 10:08
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.name = new String("beijing");
        Person person2 = (Person) person.clone();
        System.out.println(person == person2);
        person.name = "shanghai";
        System.out.println(person);
        System.out.println(person2);
    }

}

class Person implements Cloneable {
    String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
