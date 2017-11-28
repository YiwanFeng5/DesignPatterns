package cn.fywspring.factorypattern;

/**
 * 步骤二
 * 创建实现Shape接口的实现类Square
 * Created by Yiwan on 2017/11/28 0028.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
