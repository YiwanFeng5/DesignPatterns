package cn.fywspring.builderparttern;

/**
 * 步骤四
 * 创建扩展了ColdDrink接口的实体类Coke
 * @author Yiwan Feng
 * @date 2017/12/11 16:00
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
