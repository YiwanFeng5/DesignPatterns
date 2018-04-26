package cn.fywspring.chainpattern;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-26 13:08
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console:Logger: " + message);
    }
}
