package com.chengxi.pattern.principle.f02_intfsegregation;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class Segretion01 {
    public static void main(String[] args) {
        // 接口隔离原则
    }
}

// 接口
interface MyIntf{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
}

class B implements MyIntf{

    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    public void operation3() {
        System.out.println("B 实现了operation3");
    }

    public void operation4() {
        System.out.println("B 实现了operation4");
    }
}


class D implements MyIntf{

    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    public void operation2() {
        System.out.println("D 实现了operation2");
    }

    public void operation3() {
        System.out.println("D 实现了operation3");
    }

    public void operation4() {
        System.out.println("D 实现了operation4");
    }
}
// A类通过接口MyIntf 依赖（使用）B类，但是只会用到1 2 3方法
class A {
    public void depend1(MyIntf myIntf) {
        myIntf.operation1();
    }
    public void depend2(MyIntf myIntf) {
        myIntf.operation2();
    }
    public void depend3(MyIntf myIntf) {
        myIntf.operation3();
    }
}

// C类通过接口MyIntf 依赖（使用）D类，但是只会用到1 2 4方法
class C {
    public void depend1(MyIntf myIntf) {
        myIntf.operation1();
    }
    public void depend2(MyIntf myIntf) {
        myIntf.operation2();
    }
    public void depend4(MyIntf myIntf) {
        myIntf.operation4();
    }
}