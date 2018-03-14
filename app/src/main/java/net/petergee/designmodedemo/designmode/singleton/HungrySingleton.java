package net.petergee.designmodedemo.designmode.singleton;

/**
 * 饿汉式
 * 特点： 线程安全但是会造成内存浪费
 *
 * @author geqipeng
 * @date 2018/3/6
 */

public class HungrySingleton {
    private static HungrySingleton mHungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getmHungrySingleton() {
        return mHungrySingleton;
    }
}
