package cn.fywspring.builderparttern;

/**
 * 步骤四
 * 创建扩展了ColdDrink接口的实体类Pepsi
 * @author Yiwan Feng
 * @date 2017/12/11 16:01
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
