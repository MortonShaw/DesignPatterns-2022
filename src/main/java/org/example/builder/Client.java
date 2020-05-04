package org.example.builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
        System.out.println(builder.toString());
        System.out.println(builder.hashCode());
    }

}
