package SixPrinciple.InterfaceSegregationPrinciple;

/**
 * Created by yanbowen on 1/26/2017.
 */
public class Client {
    public static void main(String[] args) {
        IGreatTemperamentGirl yanxue = new PettyGirl("妈妈");
        Searcher Searcher = new Searcher(yanxue);
        Searcher.IGreatTemperamentGirl.greatTemperament();
    }
}
