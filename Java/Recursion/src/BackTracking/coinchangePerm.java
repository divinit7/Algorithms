package BackTracking;

public class coinchangePerm {
    public static void main(String[] args) {
    printPerm(new int[] {2, 3, 5, 6}, 10, "");
    }

    private static void printPerm(int[] denom, int amount, String ans) {
        if (amount == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < denom.length; i++){
            if(amount >= denom[i]) {
                printPerm(denom, amount - denom[i], ans + denom[i]);
            }
        }
    }

}
