package cn.fywspring.facadepattern;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-26 10:57
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
