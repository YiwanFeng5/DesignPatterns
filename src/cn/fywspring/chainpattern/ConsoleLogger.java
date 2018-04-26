package cn.fywspring.chainpattern;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-26 13:04
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
