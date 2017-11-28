package cn.fywspring.abstractfactorypattern;

/**
 *  创建一个工厂创造器/生成器，通过传递形状或者颜色信息来获取工厂
 * Created by Yiwan on 2017/11/28 0028.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
