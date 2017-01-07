package TwentyThreeKindsOfDesignPatterns.FactoryPattern;

/**
 * Created by yanbowen on 1/7/2017.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话！！！");
    }
}
