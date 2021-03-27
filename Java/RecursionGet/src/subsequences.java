import java.util.ArrayList;

public  class subsequences {
    public static void main(String[] args) {
        System.out.println(getSS("abc"));
    }
    public static ArrayList<String> getSS(String str){
    char cc = str.charAt(0);
    String ros = str.substring(1);
    ArrayList<String> myRes = new ArrayList<>();
    ArrayList<String> recResult = getSS(ros);
    for(int i=0; i<recResult.size(); i++){
        myRes.add(recResult.get(i));
        myRes.add(cc + recResult.get(i));
        }
    return myRes;
    }

}