package cn.fywspring.builderparttern;

import java.util.ArrayList;
import java.util.List;

/**
 * 步骤五
 * 创建一个Meal类，带有上面定义的Item对象
 * @author Yiwan Feng
 * @date 2017/12/11 16:03
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item:items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item :
                items) {
            System.out.println("Item : " + item.name());
            System.out.println(", Paking : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
