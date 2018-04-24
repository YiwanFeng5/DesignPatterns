package cn.fywspring.prototypepattern;

/**
 * 步骤一
 * 创建一个实现了Clonbale接口的抽象类
 * @author Yiwan Feng
 * @date 2017/12/11 16:54
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
