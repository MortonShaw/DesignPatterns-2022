package org.example.memento;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/15 10:47
 */
class Main {

    public static void main(String[] args) {
        Memento memento = new Memento();
        File file = new File("d:/aaa.data");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(memento);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            System.out.println(memento);
            Object o = ois.readObject();
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class Memento implements Serializable {

    String name = "a1";
    List<String> list = new ArrayList<>(2);

    {
        list.add("a");
        list.add("b");
    }

}
