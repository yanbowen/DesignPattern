package SixPrinciple.LiskovSubstitutionPrinciple;

/**
 * Created by yanbowen on 1/2/2017.
 */
public class Client {
    public static void main(String[] args) {

//        LiskovSubstitutionPrinciple1.Soldier LiskovSubstitutionPrinciple1.Soldier = new LiskovSubstitutionPrinciple1.Soldier();
//        LiskovSubstitutionPrinciple1.Soldier.setGun(new LiskovSubstitutionPrinciple1.MachineGun());
//        LiskovSubstitutionPrinciple1.Soldier.killEnemy();

        Snipper Snipper = new Snipper();
        Snipper.setGun(new AUG());
        Snipper.killEnemy();
    }
}
