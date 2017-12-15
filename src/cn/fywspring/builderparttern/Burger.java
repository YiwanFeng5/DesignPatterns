package cn.fywspring.builderparttern;

/**
 * 步骤三
 * 创建实现Item接口的抽象类Burger，该类提供了默认的功能
 * @author Yiwan Feng
 * @date 2017/12/11 15:49
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
