package cn.fywspring.abstractfactorypattern;

import cn.fywspring.factorypattern.Shape;

/**
 * 步骤五
 * 为Color和Shape创建抽象类来获取工厂。
 * Created by Yiwan on 2017/11/28 0028.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
