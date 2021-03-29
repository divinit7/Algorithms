import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        System.out.println(getPerm("abc"));
    }
    public static ArrayList<String> getPerm(String s){
     if(s.length() == 0){
         ArrayList<String> br = new ArrayList<>();
         br.add("");
         return br;
     }
        char ch = s.charAt(0);
        String ros = s.substring(1);

        ArrayList<String> rr = getPerm(ros);

        ArrayList<String> mr = new ArrayList<>();

        for(String rrs:  rr){
            for(int i=0; i <= rrs.length(); i++){
                String val = rrs.substring(0, i) + ch + rrs.substring(i);
                System.out.println(val);
                mr.add(val);
            }
        }
    return mr;
    }

}
