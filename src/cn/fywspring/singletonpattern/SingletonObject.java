package cn.fywspring.singletonpattern;

/**
 * 步骤一
 *创建一个Singleton类
 * Created by Yiwan on 2017/11/29 0029.
 */
public class SingletonObject {
    // 创建一个 singletonObject 的对象
    private static SingletonObject instance = new SingletonObject();
    // 让构造函数为 private 这样该类就不会被实例化
    private SingletonObject(){}
    // 获取唯一可用的对象
    public static SingletonObject getInstance(){
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World! ");
    }
}
