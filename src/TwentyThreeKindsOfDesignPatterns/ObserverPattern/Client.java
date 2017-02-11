package TwentyThreeKindsOfDesignPatterns.ObserverPattern;

import java.util.*;

/**
 * Created by yanbowen on 2/11/2017.
 */
public class Client {
    public static void main(String[] args) {
        //创建一个被观察者
        java.util.Observer liSi = new LiSi();
        HanFeiZi HanFeiZi = new HanFeiZi();
        HanFeiZi.addObserver(liSi);
        HanFeiZi.haveBreakfast();
    }
}
