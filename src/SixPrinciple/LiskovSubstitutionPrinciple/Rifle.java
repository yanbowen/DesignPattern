package SixPrinciple.LiskovSubstitutionPrinciple;

/**
 * Created by yanbowen on 1/2/2017.
 */
public class Rifle extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("步枪射击...");
    }
}
