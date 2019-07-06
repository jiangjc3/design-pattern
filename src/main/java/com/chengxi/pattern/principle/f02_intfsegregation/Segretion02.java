package com.chengxi.pattern.principle.f02_intfsegregation;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class Segretion02 {
    public static void main(String[] args) {
        // A类通接口去依赖B类
        A2 a2 = new A2();
        a2.depend1(new B2());
        a2.depend2(new B2());

        // C类通过接口去依赖D类
        C2 c2 = new C2();
        c2.depend1(new D2());
        c2.depend3(new D2());
    }
}

// 接口
interface MyIntf1{
    void operation1();
    void operation2();
}

interface MyIntf2{
    void operation3();
}

interface MyIntf3{
    void operation4();
}

class B2 implements MyIntf1, MyIntf2{

    public void operation1() {
        System.out.println("B2 实现了operation1");
    }

    public void operation2() {
        System.out.println("B2 实现了operation2");
    }

    public void operation3() {
        System.out.println("B2 实现了operation3");
    }
}


class D2 implements MyIntf1, MyIntf3{

    public void operation1() {
        System.out.println("D2 实现了operation1");
    }

    public void operation2() {
        System.out.println("D2 实现了operation2");
    }

    public void operation4() {
        System.out.println("D2 实现了operation4");
    }
}

// A类通过接口MyIntf1 MyIntf2 依赖（使用）B类，只能用到1 2 3方法
class A2 {
    public void depend1(MyIntf1 myIntf) {
        myIntf.operation1();
        myIntf.operation2();
    }
    public void depend2(MyIntf2 myIntf) {
        myIntf.operation3();
    }
}

// C类通过接口MyIntf1 MyIntf3依赖（使用）D类，只能用到1 2 4方法
class C2 {
    public void depend1(MyIntf1 myIntf) {
        myIntf.operation1();
        myIntf.operation2();
    }
    public void depend3(MyIntf3 myIntf) {
        myIntf.operation4();
    }
}