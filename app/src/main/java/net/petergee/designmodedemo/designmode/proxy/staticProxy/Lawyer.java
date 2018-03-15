package net.petergee.designmodedemo.designmode.proxy.staticProxy;

/**
 * 律师类
 *
 * @author petergee
 * @date 2018/3/15
 */

public class Lawyer implements IAppeal {

    private Plaintiff mPlaintiff;

    public Lawyer(Plaintiff plaintiff) {
        this.mPlaintiff = plaintiff;
    }

    @Override
    public void appeal() {
        mPlaintiff.appeal();
    }
}
