package cn.fywspring.builderparttern;

/**
 * 步骤二
 * 创建实现packing接口的实体类Bottle
 * @author Yiwan Feng
 * @date 2017/12/11 15:45
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}
