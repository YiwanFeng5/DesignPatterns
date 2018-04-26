package cn.fywspring.proxypattern;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-26 11:46
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filName;

    public ProxyImage(String filName) {
        this.filName = filName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filName);
        }
        realImage.display();
    }
}
