package BackTracking;

public class coinchange {
    public static void main(String[] args) {
       printChange(new int[]{2,3,5,6}, 10, "", 0);
    }

    private static void printChange(int[] denom, int amount, String ans,int  lastDenomidx) {
        if(amount == 0){
            System.out.println(ans);
            return;
        }

        for(int i = lastDenomidx; i < denom.length; i++){
            if (amount >= denom[i]) {
                printChange(denom, amount - denom[i], ans + denom[i], i);
            }
        }

    }
}
