package LiskovSubstitutionPrinciple;

/**
 * Created by yanbowen on 1/2/2017.
 */
public class AUG extends Rifle {
    public void zoomOut() {
        System.out.println("通过望远镜观察敌人...");
    }

    public void shoot() {
        System.out.println("AUG射击...");
    }
}
