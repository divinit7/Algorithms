

import java.util.ArrayList;
import java.util.Scanner;
//Consecutive elements have one bit change
// Recursively compute graycode of n-1 to 1 then use them to add 0 and 1 to the arraylist of n



public class GrayCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = solution(n);
        for(String str:ans){
                System.out.println(str);
        }
    }

    private static ArrayList<String> solution(int n) {
//        Base case
        if(n==1){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;
        }
        ArrayList<String> rres = solution(n-1);
        ArrayList<String> mres = new ArrayList<>();
        for(int i=0; i< rres.size(); i++){
            String str = rres.get(i);
            mres.add("0" + str);
        }
        for(int i= rres.size()-1; i >=0; i--){
            String str= rres.get(i);
            mres.add("1" + str);
        }
        return mres;
    }
}
