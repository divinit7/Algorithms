import java.util.Arrays;
import java.util.Scanner;
/*
First we recursively  passthrough the array  increasing the value of fsf once our base case is reached it creates
a array of size fsf that check backtracks through our two cases adding value in case one ("indexarr[fsf] = i") and doing nothing at all
in case two(where it is not found) that is just return the value.
 */

public class allindicesofelinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for(int i =0; i< n; i++)
            arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(solve(arr, 0, 0, sc.nextInt())));
    }

    private static int[] solve(int[] arr, int i,int fsf, int t) {
        if(i ==  arr.length)
            return new int[fsf];
        if(arr[i] == t){
            int[] indexarr = solve(arr, i+1, fsf+1, t);
            indexarr[fsf] = i;
            return indexarr;
        }
        else{
        int[] indexarr = solve(arr, i+1, fsf, t);
            return indexarr;
    }
    }
}
