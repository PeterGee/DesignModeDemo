package net.petergee.designmodedemo.designmode.decorate;

/**
 * 装饰类
 *
 * @author petergee
 * @date 2018/3/16
 */

public class SmartPhone implements IFunction {
    private IFunction iFunction;

    public SmartPhone(IFunction iFunction) {
        this.iFunction = iFunction;
    }

    @Override
    public void function() {
        iFunction.function();
    }
}
