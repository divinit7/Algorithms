import java.util.Scanner;

public class SingleNumber2 {
    public void Singlenum(int[] n){
        int[] arr = new int[32] ;
        for(int i : n) {
         for (int j = 0; j < 32; j++)
             if ((i & (1 << j)) == 1) {
                 arr[j]++;
             }

     }
     int res =0;
     for(int i =0; i<32;i++)
     if(arr[i]%3==0)
         System.out.println(arr[i]);
    }
}
