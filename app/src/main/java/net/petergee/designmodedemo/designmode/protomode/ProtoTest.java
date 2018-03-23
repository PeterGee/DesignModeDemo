package net.petergee.designmodedemo.designmode.protomode;

/**
 * @author petergee
 * @date 2018/3/23
 */

public class ProtoTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.setName("lisa");
        s.add("java");
        s.showStudent();
        System.out.println("——————————————————————————我是分割线1——————————————————————————");

        Student s2 = s.clone();
        s2.setAge(22);
        s2.setName("jerry");
        s2.add("android");
        s2.showStudent();

        System.out.println("——————————————————————————我是分割线2——————————————————————————");
        s.showStudent();

        /**
         * 浅拷贝结果：
         *      lalala   构造方法
                 Student name is lisa  age is 20
                i am good at  java
                ——————————————————————————我是分割线1——————————————————————————
                Student name is jerry  age is 22
                i am good at  java
                i am good at  android
                ——————————————————————————我是分割线2——————————————————————————
                Student name is lisa  age is 20
                i am good at  java
                i am good at  android
         *
         */


/**
 * 深拷贝结果：
 *
 *       lalala   构造方法
         Student name is lisa  age is 20
         i am good at  java
         ——————————————————————————我是分割线1——————————————————————————
         Student name is jerry  age is 22
         i am good at  java
         i am good at  android
          ——————————————————————————我是分割线2——————————————————————————
         Student name is lisa  age is 20
         i am good at  java

 */


    }
}
