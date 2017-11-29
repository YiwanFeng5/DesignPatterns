package cn.fywspring.abstractfactorypattern;

import cn.fywspring.factorypattern.Shape;

/**
 * 使用FactoryProducer来获取AbstractFactory，通过传递类型信息来获取实体类的对象
 * Created by Yiwan on 2017/11/28 0028.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        // 获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // 调用Circle的draw方法
        shape1.draw();

        // 获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        // 调用Rectangle的draw方法
        shape2.draw();

        // 获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");
        // 调用 Square 的 draw方法
        shape3.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // 获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");
        // 调用Red的fill方法
        color1.fill();

        // 获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("GREEN");
        // 调用Green的fill方法
        color2.fill();

        // 获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor("BLUE");
        // 调用Blue的fill方法
        color3.fill();
    }
}
