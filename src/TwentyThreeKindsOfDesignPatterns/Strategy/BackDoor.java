package TwentyThreeKindsOfDesignPatterns.Strategy;

/**
 * Created by yanbowen on 1/7/2017.
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施压");
    }
}
