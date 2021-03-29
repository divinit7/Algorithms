package printRecursion;

public class printboardpath {
    public static void main(String[] args) {
        BoardPath(0 , 10, "");
    }

    private static void BoardPath(int num, int sol, String ans) {
        if(num == sol){
            System.out.println(ans);
            return;
        }
        if( num > sol){
            return;
        }
        for(int dice=1; dice  <= 6; dice++){
            BoardPath(num+dice, sol, ans+dice);
        }

    }

}
