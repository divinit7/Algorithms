package BackTracking;

// qpsf - queens placed so far, tq - total queens,
// for combination just add another argument last box used and run loop with lastbox+1 used

public class QueenPermutation {
    public static void main(String[] args) {
        printPermutations(new boolean[4], 0 ,2 , "");
    }
    static int count = 0;

    private static void printPermutations(boolean[] boxes, int qpsf, int tq, String ans) {
        if (qpsf == tq){
            count++;
            System.out.println(count+". " + ans);
            return;
        }
        for (int i =0; i < boxes.length; i++){
            if (boxes[i]) {
                continue;
            }
            boxes[i] = true;
            printPermutations(boxes, qpsf+1, tq, ans + "q" + qpsf + "b" + i + " ");
            boxes[i] = false; // important step for backtracking.
        }
    }
}
