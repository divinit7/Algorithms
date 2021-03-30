package printRecursion;

public class countMazePath {
    public static void main(String[] args) {
        System.out.println(getMazePath(0, 0, 2, 2, 0));
    }

    private static int getMazePath(int cc, int cr, int ec, int er, int count) {
        if ( cc == ec && cr == er){
            return 1;
        }
        if ( cc > ec || cr > er){
            return 0;
        }
        count = getMazePath(cc+1, cr, ec, er, count);
        count = getMazePath(cc, cr+1, ec, er, count);

        return count;
    }
}
