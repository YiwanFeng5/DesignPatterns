package cn.fywspring.factorypattern;

/**
 * 使用 ShapeFactory 工厂，通过传递类型信息来获取实体类的对象
 * Created by Yiwan on 2017/11/28 0028.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        // 创建工厂类对象
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取Circle的对象
        Shape shape1 = shapeFactory.getShape("circle");
        // 调用Circle对象的draw方法
        shape1.draw();

        // 获取Rectangle的对象
        Shape shape2 = shapeFactory.getShape("rectangle");
        // 调用Rectangle对象的draw方法
        shape2.draw();

        // 获取Square的对象
        Shape shape3 = shapeFactory.getShape("square");
        // 调用Square对象的draw方法
        shape3.draw();
    }
}
