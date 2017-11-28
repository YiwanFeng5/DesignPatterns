package cn.fywspring.reflexfactorypattern;

import cn.fywspring.factorypattern.Circle;
import cn.fywspring.factorypattern.Rectangle;
import cn.fywspring.factorypattern.Square;

/**
 * 实现了反射机制的工厂类测试
 * Created by Yiwan on 2017/11/28 0028.
 */
public class ReflexFactoryPatternDemo {
    public static void main(String[] args) {
        // 创建一个实现了反射机制的工厂类
        ReflexShapeFactory reflexShapeFactory = new ReflexShapeFactory();
        // 调用 工厂类中getShape方法指定形状类获取一个实例
        Object object1 = reflexShapeFactory.getShape(Circle.class);
        // 判断这个Object是不是一个Circle类，如果是才进行强转，避免强制类型转换错误
        if (object1 instanceof Circle) {
            // 将 Object强制装换为Circle类
            Circle circle = (Circle)object1;
            // 调用 Circle类的draw方法
            circle.draw();
        }

        // 获取Rectangle实例,并调用其draw方法
        Object object2 = reflexShapeFactory.getShape(Rectangle.class);
        if (object2 instanceof Rectangle) {
            Rectangle rectangle = (Rectangle)object2;
            rectangle.draw();
        }

        // 获取Square实例，并调用其draw方法
        Object object3 = reflexShapeFactory.getShape(Square.class);
        if (object3 instanceof Square) {
            Square square = (Square)object3;
            square.draw();
        }
    }
}
