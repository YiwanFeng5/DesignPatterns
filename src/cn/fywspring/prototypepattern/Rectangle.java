package cn.fywspring.prototypepattern;

/**
 * 步骤二
 * 创建扩展了Shape抽象类的实体类Rectangle
 * @author Yiwan Feng
 * @date 2017/12/11 16:59
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
