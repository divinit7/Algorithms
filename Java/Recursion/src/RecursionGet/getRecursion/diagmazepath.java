import java.util.ArrayList;

public class diagmazepath {
    public static void main(String[] args) {
        System.out.println(getdiag(0, 0, 88, 88));
    }

    public static ArrayList<String> getdiag(int cr, int cc, int er, int ec) {
        if(cr == er && cc == ec){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if(cr > er || cc > ec) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rrh = getdiag(cr, cc +1, er, ec);
        for(String rrhs : rrh){
            mr.add("H"+ rrhs);
        }
        ArrayList<String> rrv = getdiag(cr+1, cc , er, ec);
        for(String rrhv : rrv){
            mr.add("V"+ rrhv);
        }
        ArrayList<String> rrd = getdiag(cr+1, cc +1, er, ec);
        for(String rrhd : rrd){
            mr.add("D"+ rrhd);
        }
        return mr;
    }
}
