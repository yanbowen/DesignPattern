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
        double d = 10.123456789;
        float d2 = (float) 10.896;
        System.out.println( d + "\n" + d2);

        TreeSet<Integer> subs = new TreeSet<Integer>();
        subs.add(99);
        subs.add(29);
        subs.add(57);
        System.out.println("\n" + subs);

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1); a.add(5);a.add(3);a.add(3);a.add(39);a.add(3);
        Collections.sort(a);
        a.add(2);
        Collections.reverse(a);
        System.out.println("\n" + a);
    }
}
