import java.util.Scanner;

//Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
public class NumwithAltBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    private static Boolean solve(int n) {
        if (n < 3)
            return true;
        int l = (int) Math.ceil(Math.log(n) / Math.log(2));
        int lastbit = (n & 1);
        n >>= 1;
        while (n != 0) {
            if (lastbit == (n & 1))
                return false;
            else
                n >>= 1;
        }
    return true;
    }

    public static Boolean main2(int n) {
            // Store last bit
            int prev = n % 2;
            n = n/2;

            // Traverse through remaining bits
            while (n > 0)
            {
                int curr = n % 2;

                // If current bit is same as previous
                if (curr == prev)
                    return false;

                prev = curr;
                n = n / 2;
            }

            return true;
        }
    }

