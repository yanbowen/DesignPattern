package SixPrinciple.InterfaceSegregationPrinciple;

/**
 * Created by yanbowen on 1/26/2017.
 */
public abstract class AbstractSearcher {
    protected IGreatTemperamentGirl IGreatTemperamentGirl;
    protected IGoodBodyGirl IGoodBodyGirl;

    public AbstractSearcher(SixPrinciple.InterfaceSegregationPrinciple.IGreatTemperamentGirl IGreatTemperamentGirl) {
        this.IGreatTemperamentGirl = IGreatTemperamentGirl;
    }

    public AbstractSearcher(SixPrinciple.InterfaceSegregationPrinciple.IGoodBodyGirl IGoodBodyGirl) {
        this.IGoodBodyGirl = IGoodBodyGirl;
    }

//    public abstract void show();
}
