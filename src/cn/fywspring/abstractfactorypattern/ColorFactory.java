package cn.fywspring.abstractfactorypattern;

import cn.fywspring.factorypattern.Shape;

/**
 * 步骤六
 * 创建扩展了AbstractFactory的工厂类，基于给定信息生成实体类的对象
 * Created by Yiwan on 2017/11/28 0028.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("green")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
