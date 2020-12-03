import java.util.Scanner;

// 0 <= i < j <= k < arr.length such that x = a[i]^a[i+1]...a[j-1] and y = a[j]^a[j+1]....a[k]
//  
public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int c= 0;
        for (int i = 0; i< arr.length; i++) {
            int val = arr[i];
        for(int  k =i+1; k < arr.length; k++){
            val ^= arr[k];
        if(val == 0)
            c += k-i;}
        }

    return c;
    }
}
