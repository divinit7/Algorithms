import java.util.Scanner;

public class Lastindexofoccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[]  arr = new int[n];
        for(int i =0; i< n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solve(arr, arr.length-1, t));
    }
    private static int solve(int[] arr, int idx,int t) {
    if(idx == 0)
        return -1;
    return arr[idx] == t ? idx : solve(arr, idx-1, t);
    }
    }
