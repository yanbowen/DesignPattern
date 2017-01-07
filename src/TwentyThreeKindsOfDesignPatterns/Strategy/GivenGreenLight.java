package TwentyThreeKindsOfDesignPatterns.Strategy;

/**
 * Created by yanbowen on 1/7/2017.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行！");
    }
}
