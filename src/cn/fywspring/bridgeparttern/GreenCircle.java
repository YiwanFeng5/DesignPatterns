package cn.fywspring.bridgeparttern;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-24 13:39
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircel(int radius, int x, int y) {
        System.out.println("Drawing Circel[ color: green, radius: "+radius+", x: "+x+", "+y+"]");
    }
}
