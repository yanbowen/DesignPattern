package SixPrinciple.InterfaceSegregationPrinciple;

/**
 * Created by yanbowen on 1/26/2017.
 */
public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;

    public PettyGirl(String _name) {
        this.name = _name;
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "---气质非常好！");
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "---脸蛋非常好！");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "---身材非常好！");
    }
}
