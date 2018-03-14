package net.petergee.designmodedemo.designmode.singleton;

/**
 * 懒汉式
 * 特点： 单线程线程安全，多线程线程不安全
 *
 * @author geqipeng
 * @date 2018/3/6
 */

public class LazySingleton {
    private static LazySingleton mLazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getmLazySingleton() {
        if (mLazySingleton == null) {
            mLazySingleton = new LazySingleton();
        }
        return mLazySingleton;
    }
}
