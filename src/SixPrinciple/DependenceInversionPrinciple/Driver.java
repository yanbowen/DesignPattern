package SixPrinciple.DependenceInversionPrinciple;

/**
 * Created by yanbowen on 1/24/2017.
 */
public class Driver implements IDriver {

    private ICar ICar;

    @Override
    public void driver() {
        ICar.run();
    }

    public Driver(ICar car) {
        this.ICar = car;
    }
}
