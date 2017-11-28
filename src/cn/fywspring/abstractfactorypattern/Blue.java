package cn.fywspring.abstractfactorypattern;

/**
 * 步骤四
 * 创建接口 Color 的实现类 Blue
 * Created by Yiwan on 2017/11/28 0028.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
