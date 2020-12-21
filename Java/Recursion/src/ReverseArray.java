import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[]  arr = new int[n];
            for(int i =0; i< n; i++)
                arr[i] = sc.nextInt();
            solve(arr, 0);
        }


    private static void solve(int[] arr, int i) {
        if(i == arr.length)
            return;

        solve(arr, i+1);
        System.out.print(arr[i] + " ");
    }
}
