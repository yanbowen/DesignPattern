package SixPrinciple.DependenceInversionPrinciple;

/**
 * Created by yanbowen on 1/24/2017.
 */
public class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("奔驰车开动了...");
    }
}
