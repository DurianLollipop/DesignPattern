package com.durianlollipop.princple.ocp;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShap(new Rectangle());
        graphicEditor.drawShap(new Circle());
        graphicEditor.drawShap(new Triangle());
    }
}

//这是一个用于绘图的类
class GraphicEditor {
    //接收Shap对象，然后根据type，来绘制不同的图形
    public void drawShap(Shap s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shap r) {
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shap r) {
        System.out.println("绘制圆形");
    }

    public void drawTriangle(Shap r) {
        System.out.println("绘制三角形形");
    }

}

//图形基类
class Shap {
    int m_type;
}

//矩形
class Rectangle extends Shap {
    Rectangle() {
        super.m_type = 1;
    }
}

//圆形
class Circle extends Shap {
    Circle() {
        super.m_type = 2;
    }
}

//三角形
class Triangle extends Shap {
    Triangle() {
        super.m_type = 3;
    }
}