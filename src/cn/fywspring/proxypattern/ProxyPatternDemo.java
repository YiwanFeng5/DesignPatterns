package cn.fywspring.proxypattern;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-26 11:48
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("test_10mb.jpg");
        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像将无法从磁盘加载
        image.display();
    }
}
