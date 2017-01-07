package TwentyThreeKindsOfDesignPatterns.FactoryPattern;

/**
 * Created by yanbowen on 1/7/2017.
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种说话！！！");
    }
}
