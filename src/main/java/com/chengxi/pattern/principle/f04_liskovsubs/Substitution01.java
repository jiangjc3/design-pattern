package com.chengxi.pattern.principle.f04_liskovsubs;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class Substitution01 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("10 - 3 = " + a.func1(10, 3));
        B b = new B();
        System.out.println("10 - 3 = " + b.func1(10, 3));
        System.out.println("10 - 3 + 1 = " + b.func2(10, 3));
    }
}

class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}
// 增加了一个新功能，但无意中重写了func1;
class B extends A {
    @Override
    public int func1(int a, int b) {
        return a + b;
    }
    public int func2(int a, int b) {
        return func1(a, b) + 1;
    }
}