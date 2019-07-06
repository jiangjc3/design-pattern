package com.chengxi.pattern.principle.f04_liskovsubs;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class Substitution02 {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println("10 - 3 = " + a.func1(10, 3));
        B2 b = new B2();
        // 因为B2类不在继承A2类，因此调用者不会再认为func1是求减法
        // 调用完成的功能就会很明确
        System.out.println("10 + 3 = " + b.func1(10, 3));
        System.out.println("10 + 3 + 1 = " + b.func2(10, 3));

        // 如果想用A2减法，那么就调用func3
        System.out.println("10 - 3 = " + b.func3(10, 3));
    }
}
class Base {
    // 把更加基础的方法和成员写到Base类
}

class A2 extends Base {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B2 extends Base {
    /**
     * 如果B类需要用到A类的方法，使用组合关系
     */
    private A2 a2 = new A2();

    public int func1(int a, int b) {
        return a + b;
    }
    public int func2(int a, int b) {
        return func1(a, b) + 1;
    }
    // 我们仍然想用A类的方法
    public int func3(int a, int b) {
        return a2.func1(a, b);
    }
}