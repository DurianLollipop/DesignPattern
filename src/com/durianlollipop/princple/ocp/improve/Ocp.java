package com.durianlollipop.princple.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShap(new Rectangle());
        graphicEditor.drawShap(new Circle());
        graphicEditor.drawShap(new Triangle());
        graphicEditor.drawShap(new OtherGraphic());

    }
}

//这是一个用于绘图的类
class GraphicEditor {
    //接收Shap对象，然后根据type，来绘制不同的图形
    public void drawShap(Shap s) {
        s.draw();
    }
}

//图形基类
abstract class Shap {
    int m_type;
    abstract void draw();
}

//矩形
class Rectangle extends Shap {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}

//圆形
class Circle extends Shap {
    Circle() {
        super.m_type = 2;
    }

    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}

//三角形
class Triangle extends Shap {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    void draw() {
        System.out.println("绘制三角形");
    }
}

//三角形
class OtherGraphic extends Shap {
    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    void draw() {
        System.out.println("绘制其它图形");
    }
}