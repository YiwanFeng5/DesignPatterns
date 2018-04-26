package cn.fywspring.decoratorpattern;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-26 9:48
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
