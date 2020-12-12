import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryWatch {
    public static List<String> main(String[] args) {
        List<String> wonda = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < 12; i++){
        for(int j = 0; j < 60; j++){
            if(hDist(i) + hDist(j)  == n){
                wonda.add(String.format("%d:%02d", i , j));
            }
    }
}
        return wonda;
    }
        // Count hamming distance
        public static int hDist(int num){
            int ans = 0;
            while(num != 0){
                ans++;
                num &= (num-1);
            }
            return ans;
        }
}
