package com.mingqian.principle.ocp.improve;

/**
 * Created by mingqian on 2019/7/13
 * 开闭原则
 */
public class Ocp {
  public static void main(String[] args) {

    GraphicEditor editor = new GraphicEditor();
    editor.drawShape(new Rectangle());
    editor.drawShape(new Circle());
    editor.drawShape(new Triangle());
    editor.drawShape(new OtherGraphic());
    /**
     * 运行结果：
     *    绘制矩形
     *    绘制圆形
     *    绘制三角形
     *    绘制其他图形
     */

  }
}

/**
 * Shape抽象类，基类
 */
abstract class Shape {

  /**
   * 类型
   */
  int type;

  /**
   * 抽象方法
   */
  public abstract void draw();

}

/**
 * 绘图类[使用方]
 */
class GraphicEditor {

  /**
   * 接收Shape对象，调用draw方法
   *
   * @param shape
   */
  public void drawShape(Shape shape) {
    shape.draw();
  }
}

class Rectangle extends Shape {

  Rectangle() {
    super.type = 1;
  }

  @Override
  public void draw() {
    System.out.println("绘制矩形");
  }
}

class Circle extends Shape {

  Circle() {
    super.type = 2;
  }

  @Override
  public void draw() {
    System.out.println("绘制圆形");
  }
}

class Triangle extends Shape {

  Triangle() {
    super.type = 3;
  }

  @Override
  public void draw() {
    System.out.println("绘制三角形");
  }
}

/**
 * 新增一个其他图形
 */
class OtherGraphic extends Shape {

  OtherGraphic() {
    super.type = 4;
  }


  @Override
  public void draw() {
    System.out.println("绘制其他图形");
  }
}