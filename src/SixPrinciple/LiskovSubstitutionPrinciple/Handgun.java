package SixPrinciple.LiskovSubstitutionPrinciple;

/**
 * Created by yanbowen on 1/2/2017.
 */
public class Handgun extends AbstractGun {

    @Override
    public void shoot() {
        System.out.println("手枪射击...");
    }
}
