package cn.fywspring.singletonpattern;

/**
 * 步骤二
 * 从Singleton类获取唯一的对象
 * Created by Yiwan on 2017/11/29 0029.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        // 不合法的构造函数
        // 编译时错误，构造函数 SingletonObject() 是不可见的
//        SingletonObject object = new SingletonObject();
        // 获取唯一可用的对象
//        SingletonObject object = SingletonObject.getInstance();

        // 显示消息
//        object.showMessage();

        // 6. 枚举单例模式测试
        Singleton object = Singleton.INSTANCE;
        object.whateverMathod();
    }
}
