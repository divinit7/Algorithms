package printRecursion;

public class printMazePath {

    public static void main(String[] args) {
    getMazePath(0, 0 , 2, 2, "");
    }

    private static void getMazePath(int cr, int cc, int er, int ec, String ans) {
        if(cr == er && cc == ec){
            System.out.println(ans);
            return;
        }
        if(cr > er || cc > ec){
            return;
        }

        getMazePath(cr+1, cc, er, ec , ans+"H");
        getMazePath(cr, cc+1, er, ec , ans+"V");

    }
}
