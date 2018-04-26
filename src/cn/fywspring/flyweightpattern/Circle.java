package cn.fywspring.flyweightpattern;


/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-26 11:06
 */
public class Circle implements Shape {
    private int x;
    private int y;
    private int radius;
    private  String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color: "+color+", x: "+x+", y: "+y+", radius: "+radius+"]");
    }
}
