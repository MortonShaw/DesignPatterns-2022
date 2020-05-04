package org.example.facade;

public class Facade {

    SubSystem01 s01 = new SubSystem01();
    SubSystem02 s02 = new SubSystem02();
    SubSystem03 s03 = new SubSystem03();

    public void method() {
        s01.method1();
        s02.method2();
        s03.method3();
    }

}
