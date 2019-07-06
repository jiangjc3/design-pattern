package com.chengxi.pattern.principle.f01_singlersp;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class SingleDuty03 {
    public static void main(String[] args) {
        SuperStar03 superstar = new SuperStar03();
        superstar.play("姚明");
        superstar.perform("宋小宝");
    }
}

/**
 * 方式3
 * 1. 这种方式没有对原来的类做大的修改，只是增加方法
 * 2. 虽然此方式没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然遵守单一职责原则
 * 3. 当方法功能很简单时，可以用这种方式
 */
class SuperStar03{
    public void play(String name) {
        System.out.println(name + "在NBA打篮球。。。");

    }

    public void perform(String name) {
        System.out.println(name + "在舞台上演小品。。。");
    }
}