package com.example.myapplication;

abstract class Azaza {
    abstract void a();
    abstract int b();
    abstract Boolean c();
}

class A extends Azaza {

    @Override
    void a() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Override
    int b() {
        return 0;
    }

    @Override
    Boolean c() {
        return false;
    }
}
class B extends Azaza {

    @Override
    void a() {
        System.out.println("ЪЪ");
    }

    @Override
    int b() {
        return 100500;
    }

    @Override
    Boolean c() {
        return true;
    }
}

class C extends Azaza {

    @Override
    void a() {
        System.out.println("VV");
    }

    @Override
    int b() {
        return 101;
    }

    @Override
    Boolean c() {
        return null;
    }
}