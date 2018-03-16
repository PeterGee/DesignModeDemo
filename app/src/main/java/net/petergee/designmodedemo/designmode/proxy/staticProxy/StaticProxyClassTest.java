package net.petergee.designmodedemo.designmode.proxy.staticProxy;

/**
 * 测试类
 * @author petergee
 * @date 2018/3/15
 */

public class StaticProxyClassTest {
    public static void main(String[] args) {
        //创建原告实例
        Plaintiff plaintiff = new Plaintiff("ThreeZhang");
        Lawyer lawyer = new Lawyer(plaintiff);
        lawyer.appeal();


    }
}
