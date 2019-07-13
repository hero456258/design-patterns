package com.mingqian.principle.ocp;


/**
 * Created by mingqian on 2019/7/13
 */
public class Ocp {

  public static void main(String[] args) {

    //使用看看存在的问题
    GraphicEditor editor = new GraphicEditor();
    editor.drawShape(new Rectangle());
    editor.drawShape(new Circle());
    editor.drawShape(new Triangle());

    /**
     * 运行结果：
     *    绘制矩形
     *    绘制圆形
     *    绘制三角形
     */
  }
}

/**
 * 这是一个用户绘图的类 [使用方]
 */
class GraphicEditor {

  public void drawShape(Shape shape) {
    if (shape.type == 1)
      drawRectangle(shape);
    else if (shape.type == 2)
      drawCircle(shape);
    else if (shape.type == 3)
      drawTriangle(shape);
  }

  /**
   * 绘制矩形
   * @param shape
   */
  public void drawRectangle(Shape shape){
    System.out.println("绘制矩形");
  }

  /**
   * 绘制圆形
   * @param shape
   */
  public void drawCircle(Shape shape){
    System.out.println("绘制圆形");
  }

  /**
   * 绘制三角形
   * @param shape
   */
  public void drawTriangle(Shape shape){
    System.out.println("绘制三角形");
  }
}

/**
 * Shape类，基类
 */
class Shape {
  int type;
}

class Rectangle extends Shape {

  Rectangle(){
    super.type = 1;
  }

}

class Circle extends Shape {
  Circle(){
    super.type = 2;
  }
}

class Triangle extends Shape{
  Triangle(){
    super.type = 3;
  }
}

