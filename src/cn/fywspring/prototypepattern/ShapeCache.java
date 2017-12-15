package cn.fywspring.prototypepattern;

import java.util.Hashtable;

/**
 * 创建一个类，从数据库获取实体类，并把它们存储在一个Hashtable中
 * @author Yiwan Feng
 * @date 2017/12/11 17:36
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要求添加三种形状

    public static void loadCache() {
        Circle circle = new Circle();

        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
