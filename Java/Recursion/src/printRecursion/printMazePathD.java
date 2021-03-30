package printRecursion;

import java.util.Scanner;

public class printMazePathD {
    public static void main(String[] args) {
        getDmazepath(0, 0, 2, 2, "");
    }

    private static void getDmazepath(int cr, int cc, int er, int ec, String sol) {
    if (cr == er && cc == ec){
        System.out.println(sol);
        return;
    }
    if (cr > er || cc > ec){
        return ;
    }
    getDmazepath(cr+1, cc, er, ec, sol+"H");
    getDmazepath(cr, cc+1, er, ec, sol+"V");
    getDmazepath(cr+1, cc+1, er, ec, sol+"D");
    }
}


