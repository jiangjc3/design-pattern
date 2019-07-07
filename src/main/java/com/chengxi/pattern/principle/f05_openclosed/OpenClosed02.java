package com.chengxi.pattern.principle.f05_openclosed;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class OpenClosed02 {
    public static void main(String[] args) {
        GrapicEditor02 grapicEditor = new GrapicEditor02();
        grapicEditor.drawShape(new Rectangle02());
        grapicEditor.drawShape(new Circle02());
        grapicEditor.drawShape(new Triangle02());
    }
}

class GrapicEditor02 {
    public void drawShape(Shape02 s) {
        s.draw();
    }

}

// Shape类，基类
abstract class Shape02 {
    int type;

    public abstract void draw();
}

// 矩形
class Rectangle02 extends Shape02 {
    Rectangle02() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

// 圆形
class Circle02 extends Shape02 {
    Circle02() {
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增一个绘制三形的功能
class Triangle02 extends Shape02 {
    Triangle02() {
        super.type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}