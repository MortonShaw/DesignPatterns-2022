package org.example.adapter.theory;

public class ObjectAdapterTest {

    public static void main(String[] args) {
        Target target = new ObjectAdapter(new Adaptee());
        target.request();
    }

}
