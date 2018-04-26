package cn.fywspring.chainpattern;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-26 13:11
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int levle) {
        this.level = levle;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
