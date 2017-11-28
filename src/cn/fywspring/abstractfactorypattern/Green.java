package cn.fywspring.abstractfactorypattern;

/**
 * 步骤四
 * 创建实现接口 Color 的实体类 Green
 * Created by Yiwan on 2017/11/28 0028.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
