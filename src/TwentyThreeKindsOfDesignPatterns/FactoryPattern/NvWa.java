package TwentyThreeKindsOfDesignPatterns.FactoryPattern;

/**
 * Created by yanbowen on 1/7/2017.
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = abstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("\n--造出的第二批人是黑色人种--");
        Human blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("\n--造出的第三批人是黄色人种--");
        Human yellowHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
