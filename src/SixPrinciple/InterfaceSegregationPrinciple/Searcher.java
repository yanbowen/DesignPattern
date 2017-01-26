package SixPrinciple.InterfaceSegregationPrinciple;

/**
 * Created by yanbowen on 1/26/2017.
 */
public class Searcher extends AbstractSearcher {
    public Searcher(SixPrinciple.InterfaceSegregationPrinciple.IGreatTemperamentGirl IGreatTemperamentGirl) {
        super(IGreatTemperamentGirl);
    }

    public Searcher(SixPrinciple.InterfaceSegregationPrinciple.IGoodBodyGirl IGoodBodyGirl) {
        super(IGoodBodyGirl);
    }

//    @Override
//    public void show() {
//        System.out.println("------美女信息如下------");
//        //身体好
//        super.IGoodBodyGirl.goodLooking();
//        //脸蛋好
//        super.IGoodBodyGirl.niceFigure();
//        //有气质
//        super.IGreatTemperamentGirl.greatTemperament();
//    }
}
