package cn.fywspring.builderparttern;

/**
 * 步骤四
 * 创建扩展了Burger的实体类Chicken Burger
 * @author Yiwan Feng
 * @date 2017/12/11 15:58
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
