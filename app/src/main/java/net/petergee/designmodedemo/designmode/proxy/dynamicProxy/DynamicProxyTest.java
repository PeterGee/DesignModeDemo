package net.petergee.designmodedemo.designmode.proxy.dynamicProxy;

/**动态代理测试类
 * @author petergee
 * @date 2018/3/15
 */

public class DynamicProxyTest {
    public static void main(String[] args) {
        DynamicIAppeal plaintiff = new DynamicPlaintiff("FourLi");
        DynamicIAppeal proxy = (DynamicIAppeal) new DynamicLawyer(plaintiff).getDynamicProxy();
        proxy.appeal();

    }
}
