package net.petergee.designmodedemo.designmode.decorate;

/**
 * @author petergee
 * @date 2018/3/16
 */

public class DecorateTest {
    public static void main(String[] args) {
        System.out.println("——————————普通手机功能————————————");
        NormalPhone normalPhone = new NormalPhone();
        normalPhone.function();
        System.out.println("——————————小米手机功能—————————————");
        XiaomiPhone xiaomiPhone = new XiaomiPhone(normalPhone);
        xiaomiPhone.function();
        System.out.println("—————————华为手机功能————————————");
        //华为手机在小米手机基础上再添加指纹识别功能
        HuaweiPhone huaweiPhone = new HuaweiPhone(xiaomiPhone);
        huaweiPhone.function();

    }
}
