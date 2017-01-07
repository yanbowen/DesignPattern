package TwentyThreeKindsOfDesignPatterns.Strategy;

/**
 * Created by yanbowen on 1/7/2017.
 */
public class Zhaoyun {
    public static void main(String[] args) {
        Context Context;
        System.out.println("---刚到吴国的时候拆开第一个锦囊---");
        Context = new Context(new BackDoor());
        Context.operate();
        System.out.println("\n");

        System.out.println("---刘备乐不思蜀，拆开第二个锦囊---");
        Context = new Context(new GivenGreenLight());
        Context.operate();
        System.out.println("\n");

        System.out.println("---孙权追兵来了，拆开第三个锦囊---");
        Context = new Context(new BlockEnemy());
        Context.operate();
        System.out.println("\n");
    }
}
