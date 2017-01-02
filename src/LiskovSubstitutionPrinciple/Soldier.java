package LiskovSubstitutionPrinciple;

/**
 * Created by yanbowen on 1/2/2017.
 */
public class Soldier {
    private AbstractGun gun;

    public void setGun(AbstractGun _gun) {
        this.gun = _gun;
    }

    public void killEnemy() {
        System.out.println("士兵开始杀人...");
        gun.shoot();
    }
}
