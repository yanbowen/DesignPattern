package TwentyThreeKindsOfDesignPatterns.ObserverPattern;

import java.util.Observable;

/**
 * Created by yanbowen on 2/11/2017.
 */
public class HanFeiZi extends Observable implements IHanFeiZi {

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭...");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐...");
        super.setChanged();
        super.notifyObservers("韩非子开始娱乐...");

    }
}
