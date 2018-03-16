package net.petergee.designmodedemo.designmode.decorate;

/**
 * 具体装饰类子类
 *
 * @author petergee
 * @date 2018/3/16
 */

public class HuaweiPhone extends SmartPhone {
    public HuaweiPhone(IFunction iFunction) {
        super(iFunction);
    }

    //添加指纹识别功能
    private void touchIdFunction() {
        System.out.println("指纹识别");
    }

    @Override
    public void function() {
        super.function();
        touchIdFunction();
    }
}
