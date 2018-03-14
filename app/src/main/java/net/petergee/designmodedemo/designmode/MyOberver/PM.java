package net.petergee.designmodedemo.designmode.MyOberver;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品经理类
 * @author geqipeng
 * @date 2018/3/13
 */

public class PM implements Observable {
    private List<Observer> mList;

    public PM() {
        mList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        mList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (mList.size() == 0) {
            return;
        }
        mList.remove(observer);
    }

    @Override
    public void notifyAllObserver(String str) {
        for (Observer observer : mList) {
            observer.update(str);
        }
    }


}
