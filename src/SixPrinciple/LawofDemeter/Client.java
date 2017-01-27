package SixPrinciple.LawofDemeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanbowen on 1/27/2017.
 */
public class Client {
    public static void main(String[] args) {
        List<Girl> listGirls = new ArrayList<Girl>();
        //初始化女生
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());

        }
        Teacher Teacher = new Teacher();
        Teacher.commond(new GroupLeader(listGirls));
    }
}
