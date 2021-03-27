import java.util.Arrays;

public class allindices {
    public static void main(String[] args) {
        int arr[] = new int[]{12, 23, 1, 21, 55, 2 , 1, 0, 1, 34, 1};
        System.out.println(Arrays.toString(retall(arr,0, 1,  0)));
    }

    public static int[] retall(int[] arr, int i, int num, int count) {
        int[] indices = null;
        if(i == arr.length){
            int[] base = new int[count];
            return base;
        }
        if(arr[i] == num){
            indices = retall(arr, i+1, num, count+1);
        }
        else
        {
            indices = retall(arr, i+1, num, count);
        }
        if(arr[i] == num){
            indices[count] = i;
        }
        return  indices;
    }
}
