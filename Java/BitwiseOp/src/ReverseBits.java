import java.util.Scanner;

// Integer.parseUnsignedInt(sb.toString(), 2) - The parseUnsignedInt() is a method of Java Integer class.
// the second integer is telling it to treat the given number as number base of 2 binary,
// 8 is octal , 10 is decimal and 16 hexa
public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
        reverseBits(n);

    }

    private static void solve(int n) {
        //use flag to check if the first hot bit has been found
        boolean flag = false;
        for(int i=31; i>=0;i--){
            int mask = (1<<i); //create a mask hot at respective bit position
            if(flag) {
//                if ((n & mask) != 0) {
//                    System.out.println(1);
//                } else
                System.out.println ( (n&mask) !=0 ? 0 :1 ); // print 0 instead of 1 where 1 is found
            } else
            if((n & mask) != 0){
                flag = true;
                System.out.println(0);
                }
            }
        }
    static int reverseBits(int n) {
        int ret=0;
        // because there are 32 bits in total
        for (int i = 0; i <32;i++){
            ret = ret<<1;
            // If the bit is 1 we OR it with 1, ie add 1
            if((n & 1) > 0){
                ret = ret | 1;
            }
            n=n>>>1;
        }
        return ret;
    }
}



