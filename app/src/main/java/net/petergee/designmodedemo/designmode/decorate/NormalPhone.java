package net.petergee.designmodedemo.designmode.decorate;

/**
 * 真实实现类
 * @author petergee
 * @date 2018/3/16
 */

public class NormalPhone implements IFunction {
    @Override
    public void function() {
        System.out.println("打电话");
    }
}
