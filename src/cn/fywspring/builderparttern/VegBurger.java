package cn.fywspring.builderparttern;

/**
 * 步骤四
 * 创建扩展了Burger的实体类Veg Burger
 * @author Yiwan Feng
 * @date 2017/12/11 15:55
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
