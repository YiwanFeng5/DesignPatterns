package cn.fywspring.factorypattern.reflexfactorypattern;

import cn.fywspring.factorypattern.Shape;

/**
 * 使用反射机制可以解决每次增加一个产品时，都需要修改工厂类（增加一个对象实现工厂）这个缺点
 * Created by Yiwan on 2017/11/28 0028.
 */
public class ReflexShapeFactory {
    public Object getShape(Class<?extends Shape> clazz) {
        Object object = null;
        try {
            object = Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
