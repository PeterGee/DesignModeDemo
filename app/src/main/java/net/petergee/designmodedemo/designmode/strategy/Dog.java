package net.petergee.designmodedemo.designmode.strategy;

/**
 * @author geqipeng
 * @date 2018/3/2
 */

public class Dog implements IFavoriteFood {
    @Override
    public String getFavoriteFood() {
        return "meat";
    }
}
