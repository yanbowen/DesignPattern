package TwentyThreeKindsOfDesignPatterns.Strategy;

/**
 * Created by yanbowen on 1/7/2017.
 */
public class Context {
    private IStrategy IStrategy;

    public Context(TwentyThreeKindsOfDesignPatterns.Strategy.IStrategy IStrategy) {
        this.IStrategy = IStrategy;
    }

    public void operate() {
        this.IStrategy.operate();
    }
}
