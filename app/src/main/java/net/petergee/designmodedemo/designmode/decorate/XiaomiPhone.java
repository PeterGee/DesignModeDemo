package net.petergee.designmodedemo.designmode.decorate;

/**
 * 具体装饰类
 *
 * @author petergee
 * @date 2018/3/16
 */

public class XiaomiPhone extends SmartPhone {
    public XiaomiPhone(IFunction iFunction) {
        super(iFunction);
    }
    //添加拍照功能
    private void takePhoto() {
        System.out.println("拍照");
    }

    @Override
    public void function() {
        super.function();
        takePhoto();
    }

}
