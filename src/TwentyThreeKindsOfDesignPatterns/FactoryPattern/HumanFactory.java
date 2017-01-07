package TwentyThreeKindsOfDesignPatterns.FactoryPattern;

/**
 * Created by yanbowen on 1/7/2017.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("产生错误！");
        }
        return (T) human;
    }
}
