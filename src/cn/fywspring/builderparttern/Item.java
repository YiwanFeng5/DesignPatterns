package cn.fywspring.builderparttern;

/**
 * 步骤一
 * 创建一个表示食物条目的接口
 * @author Yiwan Feng
 * @date 2017/12/11 15:39
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
