package cn.fywspring.bridgeparttern;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-24 13:48
 */
public class BridgePartternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,10,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
