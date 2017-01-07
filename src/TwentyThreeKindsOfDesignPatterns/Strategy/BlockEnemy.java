package TwentyThreeKindsOfDesignPatterns.Strategy;

/**
 * Created by yanbowen on 1/7/2017.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
