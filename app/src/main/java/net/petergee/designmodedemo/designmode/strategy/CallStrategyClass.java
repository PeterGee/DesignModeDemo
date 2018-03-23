package net.petergee.designmodedemo.designmode.strategy;

/**
 * @author geqipeng
 * @date 2018/3/2
 */

public class CallStrategyClass {




    public String callStrategy(IFavoriteFood iFavoriteFood) {
        return iFavoriteFood.getFavoriteFood();
    }

    public String getFavoriteFoodByAnimalType(String type) {
        if (type.equals("猫")) {
            return "老鼠";
        } else if (type.equals("狗")) {
            return "肉";
        }
        return "";
    }

}
