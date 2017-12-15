package cn.fywspring.prototypepattern;

/**
 * 步骤二
 * 创建扩展了Shap抽象类的实体类Square
 * @author Yiwan Feng
 * @date 2017/12/11 17:02
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
