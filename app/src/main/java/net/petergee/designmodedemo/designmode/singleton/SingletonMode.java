package net.petergee.designmodedemo.designmode.singleton;

/**
 * 双重锁方式
 * 特点：多线程安全，效率高，推荐使用
 *
 * @author geqipeng
 * @date 2018/3/2
 */

public class SingletonMode {
    private static SingletonMode mSingletonMode;

    //私有构造方法
    private SingletonMode() {
    }

    public static SingletonMode getmSingletonMode() {
        if (mSingletonMode == null) {
            //添加同步锁，防止出现多线程问题
            synchronized (SingletonMode.class) {
                if (mSingletonMode == null) {
                    mSingletonMode = new SingletonMode();
                }
            }
        }
        return mSingletonMode;
    }
}
