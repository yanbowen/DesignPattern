package SixPrinciple.DependenceInversionPrinciple;

/**
 * Created by yanbowen on 1/24/2017.
 */
public class Client {
    public static void main(String[] args) {
        ICar benz = new Benz();
        IDriver zhangsan = new Driver(benz);
        zhangsan.driver();
    }
}
