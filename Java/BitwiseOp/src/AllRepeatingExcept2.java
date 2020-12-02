import java.util.Scanner;

public class AllRepeatingExcept2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0 ; i< n; i++)
            arr[i] = sc.nextInt();
        solution(arr);
    }

    private static void solution(int[] arr) {
        int xor = 0;
        for(int val: arr){
            xor ^= val;
        }
        // set bits in xor indicates odd number of ones which means different bit between the two numbers
        int rmsb = xor & - xor;
        int x=0,y=0;
        for(int val: arr){
            if((val & rmsb) == 0 ){
                x^= val;
            }
            else
                y^= val;
        }
        System.out.println(x +"  "+ y);
    }
}
