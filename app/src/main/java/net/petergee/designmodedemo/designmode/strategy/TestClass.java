package net.petergee.designmodedemo.designmode.strategy;

/**
 * @author geqipeng
 * @date 2018/3/2
 */

public class TestClass {
    public static void main(String[] args) throws Exception{
        //创建实例
        CallStrategyClass callStrategyClass = new CallStrategyClass();

        //普通模式
        String catFav=callStrategyClass.getFavoriteFoodByAnimalType("猫");
        String dogFav=callStrategyClass.getFavoriteFoodByAnimalType("狗");
        //打印
        System.out.println("catFav is:" + catFav);
        System.out.println("dogFav is:" + dogFav);


        System.out.println("分割线**************************************************************分割线");
        //策略模式
        //获取不同种类动物喜欢吃的食物
        String dogFavoriteFood = callStrategyClass.callStrategy(new Dog());
        String catFavoriteFood = callStrategyClass.callStrategy(new Cat());

        //打印
        System.out.println("dogFavoriteFood is:" + dogFavoriteFood);
        System.out.println("catFavoriteFood is:" + catFavoriteFood);


    }
}
