package net.petergee.designmodedemo.designmode.adapter;

/**
 * @author geqipeng
 * @date 2018/3/9
 */

public class AdapterTest {
    public static void main(String[] args){
        AmericaBank americaBank=new AmericaBank(new ChinaCard());
        String moneyType=americaBank.withdrawCash();
        System.out.println("moneyType===="+moneyType);
    }
}
