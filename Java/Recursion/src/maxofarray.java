import java.util.Scanner;

public class maxofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for(int i =0; i< n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solve(arr, 0));
    }

    private static int solve(int[] arr, int idx) {
        if(idx == arr.length -1)
            return arr[idx];
    int maxOfsmallarr = solve(arr, idx+1);
    if( maxOfsmallarr > arr[idx])
        return maxOfsmallarr;
    else
        return arr[idx];
    }
}
