package com.chengxi.pattern.principle.f03_depdinversion;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class Inversion02 {
    public static void main(String[] args) {
        Person02 person02 = new Person02();
        person02.receive(new Email02());
        person02.receive(new Message());
    }
}

//先定义一个接口
interface Receiver {
    String getInfo();
}

class Email02 implements Receiver {
    public String getInfo() {
        return "电子邮件信息： HELLO WORLD";
    }
}

//增加短信
class Message implements Receiver {

    public String getInfo() {
        return "短信信息： HELLO WORLD";
    }
}

class Person02 {
    public void receive(Receiver receiver) {
        System.out.println(receiver.getInfo());
    }
}