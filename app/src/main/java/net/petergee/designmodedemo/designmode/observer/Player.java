package net.petergee.designmodedemo.designmode.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * @author geqipeng
 * @date 2018/3/13
 */

public class Player implements Observer {
    public String mName;

    public Player(String name) {
        this.mName = name;
    }

    //更新数据
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("hello,"+mName+"你的任务是"+arg);
    }
}
