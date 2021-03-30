package printRecursion;

public class boardpathcount {
    public static void main(String[] args) {
        System.out.println(countpath(0, 210));
    }

    private static int countpath(int num, int sol) {
        if(num == sol){
            return 1;
        }
        if( num > sol){
            return 0;
        }
        int count =0;
        for (int dice =1; dice <=6; dice++){
            count += countpath(num+dice, sol);
        }
        return count;
    }
}
