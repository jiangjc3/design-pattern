package com.chengxi.pattern.principle.f01_singlersp;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class SingleDuty01 {
    /**
     * 设计模式七大原则
     * 1 单一职责原则
     * 一般是对于类来说， 一个类应该只负责一个职责。或者可以定义为：就一个类而言，应该只有一个引起它变化的原因。
     * 如果类A负责两个不同的职责1 2， 如果职责1需求更改时， 有可能造成职责2执行出错
     * 所以应该将类A的粒度分解为A1 A2
     */

    public static void main(String[] args) {
        SuperStar01 superstar = new SuperStar01();
        superstar.play("姚明");
        superstar.play("宋小宝");
    }
}

/**
 * 方式1
 * 1. 在方式1的play方法中，违反了单一职责原则
 * 2. 解决方案： 根据明星的行业不同， 分解成不同的
 */
class SuperStar01 {
    public void play(String name) {
        System.out.println(name + "在NBA打篮球。。。");
    }
}