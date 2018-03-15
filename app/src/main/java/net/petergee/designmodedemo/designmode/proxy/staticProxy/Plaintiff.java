package net.petergee.designmodedemo.designmode.proxy.staticProxy;

/**
 * 原告类
 *
 * @author petergee
 * @date 2018/3/15
 */

public class Plaintiff implements IAppeal {
    private String mName;

    public Plaintiff(String name) {
        this.mName = name;
    }

    @Override
    public void appeal() {
        System.out.println("I am " + mName + ",i wanna appeal");
    }
}
