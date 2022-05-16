package subhaTask;

import java.util.Locale;

public class AllSmallReplaceSpaceUnderscoreAndHyphen {
    public void allSmallReplaceSpaceUnderscoreAndHyphen(String s,String ss) {
        s = s.toLowerCase().replaceAll(" ", "_");
        ss = ss = ss.toLowerCase().replaceAll(" ", "-");
        System.out.println(s);
        System.out.println(ss);
    }


    public static void main(String[] args) {
        AllSmallReplaceSpaceUnderscoreAndHyphen obj = new AllSmallReplaceSpaceUnderscoreAndHyphen();
        obj.allSmallReplaceSpaceUnderscoreAndHyphen("I haVE chanGED mY DOmAIN ScalA inTO JavA",
                "I am WorKING iN QbRAINX");
    }
}
