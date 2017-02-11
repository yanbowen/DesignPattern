package TwentyThreeKindsOfDesignPatterns.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yanbowen on 2/11/2017.
 */
public class LiSi implements Observer {
    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告秦始皇..." + reportContext);
    }

    @Override
    public void update(Observable observable, Object object) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报...");
        this.reportToQinShiHuang(object.toString());
        System.out.println("李斯：汇报完毕...\n");
    }
}
