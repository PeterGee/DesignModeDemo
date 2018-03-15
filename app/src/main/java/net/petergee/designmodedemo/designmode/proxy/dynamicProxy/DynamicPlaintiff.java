package net.petergee.designmodedemo.designmode.proxy.dynamicProxy;

/**
 * 动态代理原告类
 *
 * @author petergee
 * @date 2018/3/15
 */

public class DynamicPlaintiff implements DynamicIAppeal {
    private String mName;
    public DynamicPlaintiff(String name){
        this.mName=name;
    }

    @Override
    public void appeal() {
        System.out.println("i am "+mName+" i wanna appeal");
    }
}
