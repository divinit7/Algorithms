package printRecursion;

public class mazePathDiag {
    public static void main(String[] args) {
        System.out.println(getmazepath(0, 0, 2, 2));
    }

    private static int getmazepath(int cr, int cc, int er, int ec) {
        if ( cc == ec && cr == er){
            return 1;
        }
        if (cc > ec || cr > er){
            return 0;
        }
        int ch = getmazepath(cr+1, cc, er, ec);
        int cv = getmazepath(cr, cc+1, er, ec);
        int cd = getmazepath(cr+1, cc+1, er, ec);

    return ch+cd+cv;
    }
}
