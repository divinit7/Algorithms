import java.util.Scanner;
//Basically, it makes use of the fact that x^x = 0 and 0^x=x.
// So all paired elements get XOR'd and vanish leaving the lonely element.
public class Allthriceexceptone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        solve(arr);
    }

    private static void solve(int[] arr) {
        int ones = 0;
        int twos = 0;
        int not_threes;
        for (int x : arr) {
            twos |= ones & x; //add to twos if it exists in ones
            ones ^= x;         // if it exists in ones, remove it, otherwise add it
            // next 3 lines of code convert the common 1s between ones and twos to zero.
            not_threes = ~(ones & twos); // if x is in ones and twos, dont add it to threes
            ones &= not_threes; // remove x from ones
            twos &= not_threes; // remove x from twos
        }
        System.out.println(ones);
    }
}
/*
If a bit is already in ones, add it to twos.

XOR will add this bit to ones if it's not there or remove this bit from ones if it's already there.

If a bit is in both ones and twos, remove it from ones and twos.

When finished, ones contains the bits that only appeared 3*n+1 times, which are the bits for the element that only appeared once.
 */