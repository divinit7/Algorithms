package printRecursion;

public class printPermutations {
    public static void main(String[] args) {
        getPerm("abc", "");
    }

    private static void getPerm(String str, String s) {
        if( str.length() == 0){
            System.out.println(s);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1);
            getPerm(ros, s+ch);
        }
    }

}
