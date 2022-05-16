package subhaTask;

import java.util.Scanner;

public class AllSmallRemoveSpace {

//    Scanner sn = new Scanner(System.in);
//    String str = sn.nextLine();

    void allSmallRemoveSpace(String str){
        str=str.toLowerCase();
        System.out.println(str.replaceAll("\\s",""));
    }

    public static void main(String[] args) {
        AllSmallRemoveSpace allSmallRemoveSpace = new AllSmallRemoveSpace();
        allSmallRemoveSpace.allSmallRemoveSpace("POOJA Is a GOod gIRl");
    }

}
