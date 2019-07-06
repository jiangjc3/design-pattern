package com.chengxi.pattern.principle.f03_depdinversion;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class Inversion01 {
    /**
     * 依赖倒转原则
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
// 完成Person接收消息的功能
class Email{
    public String getInfo() {
        return "电子邮件信息： HELLO WORLD";
    }
}

class Person{
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}