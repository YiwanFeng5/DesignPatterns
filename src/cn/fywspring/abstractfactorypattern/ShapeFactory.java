package cn.fywspring.abstractfactorypattern;

import cn.fywspring.factorypattern.Circle;
import cn.fywspring.factorypattern.Rectangle;
import cn.fywspring.factorypattern.Shape;
import cn.fywspring.factorypattern.Square;

/**
 * 步骤六
 *创建扩展了AbstractFactory的工厂类，基于给定信息生成实体类的对象
 * Created by Yiwan on 2017/11/28 0028.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
