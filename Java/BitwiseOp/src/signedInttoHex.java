import java.util.Scanner;
// convert to unsigned int by AND with 0x00000000ffffffffL

public class signedInttoHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = unsign(n);

    }

    private static int unsign(int n) {
        return (int) (n & 0x00000000ffffffffL);  // 8 0/f  and then L
    }
}
