public class pattern {
    public static void main(String[] args) {
        buildpattern(1, 1,5);
    }

    private static void buildpattern(int col, int row, int i) {
        if(row > i){
            return;
        }
        if(col > row){
            System.out.println();
            buildpattern(1, row+1, i);
            return;
        }

        System.out.print('*');
        buildpattern(col+1, row, i);

    }
}
