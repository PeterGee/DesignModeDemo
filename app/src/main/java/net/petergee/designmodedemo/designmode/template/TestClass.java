package net.petergee.designmodedemo.designmode.template;

/**
 * @author geqipeng
 * @date 2018/3/6
 */

public class TestClass {
    public static void main(String[] args) {
        Programmer javaProgrammer = new JavaProgrammer();
        Programmer androidProgrammer = new AndroidProgrammer();
        System.out.println("____________________javaProgrammer_____________________________");
        javaProgrammer.doTemplateMethod();
        System.out.println("____________________androidProgrammer_____________________________");
        androidProgrammer.doTemplateMethod();
    }
}
