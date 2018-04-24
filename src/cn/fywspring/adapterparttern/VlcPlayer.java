package cn.fywspring.adapterparttern;

/**
 * Created by Yiwan
 * Email at ily19910525fyw@126.com
 * Created on 2018-04-24 11:20
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file, Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
