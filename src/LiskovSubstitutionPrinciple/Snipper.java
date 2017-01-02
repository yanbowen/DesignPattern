package LiskovSubstitutionPrinciple;

/**
 * Created by yanbowen on 1/2/2017.
 */
public class Snipper {
    private AUG aug;

    public void setGun(AUG _auge) {
        aug = _auge;
    }

    public void killEnemy() {
        aug.zoomOut();
        aug.shoot();
    }
}
