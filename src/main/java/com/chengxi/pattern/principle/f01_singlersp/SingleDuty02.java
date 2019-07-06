package com.chengxi.pattern.principle.f01_singlersp;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class SingleDuty02 {
    public static void main(String[] args) {
        BasketballStar basketballStar = new BasketballStar();
        basketballStar.play("姚明");
        ComedyStar comedyStar = new ComedyStar();
        comedyStar.play("宋小宝");
    }
}

/**
 * 方式2
 * 1. 遵守单一职责原则
 * 2. 但是有的时候这样做改动可能会很大， 因为会将类分解，同时修改客户端
 * 3. 所以如果是遇到这种功能比较简单的类，有时也可以改成方法级别单一职责的类型
 */
class BasketballStar{
    public void play(String name) {
        System.out.println(name + "在NBA打篮球。。。");
    }
}

class ComedyStar{
    public void play(String name) {
        System.out.println(name + "在舞台上演小品。。。");
    }
}
