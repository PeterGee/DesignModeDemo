package net.petergee.designmodedemo.designmode.composite;

/**
 * @author geqipeng
 * @date 2018/3/8
 */

public class CompositeTestClass {
    public static void main(String[] args) {
        Company company = new Company();
        int count = company.getMemberCount();
        System.out.println("公司人数：" + count);
    }
}
