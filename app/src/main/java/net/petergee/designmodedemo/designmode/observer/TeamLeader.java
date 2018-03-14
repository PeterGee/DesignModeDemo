package net.petergee.designmodedemo.designmode.observer;

import java.util.Observable;

/**
 * 队长
 * @author geqipeng
 * @date 2018/3/13
 */

public class TeamLeader extends Observable {
    public void assignTask(String task) {

        // 标记对象发生变化
        setChanged();

        //通知观察者
        notifyObservers(task);

    }
}
