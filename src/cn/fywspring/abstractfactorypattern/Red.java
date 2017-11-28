package cn.fywspring.abstractfactorypattern;

/**
 * 步骤四
 * 创建实现接口Color的实体类Red
 * Created by Yiwan on 2017/11/28 0028.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
