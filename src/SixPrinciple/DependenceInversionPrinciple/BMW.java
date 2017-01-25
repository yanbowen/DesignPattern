package SixPrinciple.DependenceInversionPrinciple;

/**
 * Created by yanbowen on 1/24/2017.
 */
public class BMW implements ICar {
    @Override
    public void run() {
        System.out.println("宝马车开始了...");
    }
}
