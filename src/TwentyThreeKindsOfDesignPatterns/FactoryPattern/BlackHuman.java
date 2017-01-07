package TwentyThreeKindsOfDesignPatterns.FactoryPattern;

/**
 * Created by yanbowen on 1/7/2017.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话！！！");

    }
}
