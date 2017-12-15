package cn.fywspring.builderparttern;

/**
 * 步骤二
 * 创建实现Packing接口实体类Wapper
 * @author Yiwan Feng
 * @date 2017/12/11 15:44
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
