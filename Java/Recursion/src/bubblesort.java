import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 7, 8, 8, 0, 10, 11, 34, 45, 1};
        buba(arr, 0, arr.length-1);
    }

    public static void buba(int[] arr, int si, int li) {
        if( li == 0){
            return;
        }
        if( si == li ){
            System.out.println("round");
            buba(arr, 0, li-1);
            return;
        }
        if(arr[si] > arr[si+1]) {
            int m = arr[si];
            arr[si] = arr[si + 1];
            arr[si + 1] = m;
            System.out.println(Arrays.toString(arr));
        }
            buba(arr, si + 1, li);

    }

}
