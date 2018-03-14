package net.petergee.designmodedemo.designmode.MyOberver;

/**
 * 被观察者
 *
 * @author geqipeng
 * @date 2018/3/13
 */

public interface Observable {
    //添加观察者
    void addObserver(Observer observer);

    //移除观察者
    void deleteObserver(Observer observer);

    //通知观察者
    void notifyAllObserver(String str);
}
