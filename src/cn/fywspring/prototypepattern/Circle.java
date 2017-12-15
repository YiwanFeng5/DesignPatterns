package cn.fywspring.prototypepattern;

/**
 * 步骤二
 * 创建扩展了Shap抽象类的实体类Circle
 * @author Yiwan Feng
 * @date 2017/12/11 17:05
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
