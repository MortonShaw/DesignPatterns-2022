package org.example.adapter.theory;

public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }

}
