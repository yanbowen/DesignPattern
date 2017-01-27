package SixPrinciple.LawofDemeter;

import java.util.List;

/**
 * Created by yanbowen on 1/27/2017.
 */
public class GroupLeader {
    private List<Girl> listGirls;

    public GroupLeader(List<Girl> listGirls) {
        this.listGirls = listGirls;
    }

    //清查女生数量
    public void countGirls() {
        System.out.println("女生数量是： " + this.listGirls.size());
    }
}
