package com.chengxi.pattern.principle.f05_openclosed;

/**
 * Created By CHENGXI on 2019/7/6
 */
public class OpenClosed01 {
    public static void main(String[] args) {
        GrapicEditor grapicEditor = new GrapicEditor();
        grapicEditor.drawShape(new Rectangle());
        grapicEditor.drawShape(new Circle());
    }
}

// 这是一个绘图的类
class GrapicEditor {
    public void drawShape(Shape s) {
        if (s.type == 1) {
            drawRectangle();
        } else if (s.type == 2) {
            drawCycle();
        } // 新增图形类型就得新增分支，并且新增方法
    }

    private void drawRectangle() {
        System.out.println("绘制矩形");
    }

    private void drawCycle() {
        System.out.println("绘制圆形");
    }
}

// Shape类，基类
class Shape {
    int type;
}

// 矩形
class Rectangle extends Shape {
    Rectangle() {
        super.type = 1;
    }
}

// 圆形
class Circle extends Shape {
    Circle() {
        super.type = 2;
    }
}

// 新增一个绘制三形的功能
class Triangle extends Shape {
    Triangle() {
        super.type = 3;
    }
}