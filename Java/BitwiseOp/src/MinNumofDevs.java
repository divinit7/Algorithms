import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Minimum number of developers such that we have all the skills required
// map the skills to a one hot encoding, OR them in a tree to find all ones
public class MinNumofDevs {
    static  ArrayList<Integer> sol = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i< n ; i++){
            map.put(sc.next(), i);
        }

        int np = sc.nextInt();
        int[] people = new int[np];
        for(int i = 0; i< np; i++){
            int personskills = sc.nextInt();
            for( int j= 0; j< personskills; j++){
                String skill = sc.next();
                int snum = map.get(skill);
                people[i] = people[i] | (1 << snum);
            }
        }
        solution(people, n, 0, new ArrayList<Integer>(), 0);
        System.out.println(sol);
    }

    private static void solution(int[] people, int nskills, int cp, ArrayList<Integer> onesol, int smask) {
        if(cp == people.length){
            if(smask == (1<<nskills) -1){  // creates ones of length nskills
                if(sol.size() == 0 || onesol.size() < sol.size()){
                    sol = new ArrayList<>(onesol);
                }
            }
            return;
        }
        //says no,simply increase the current person
        solution(people, nskills, cp+1, onesol, smask);
        // if yes, then add
        onesol.add(cp);
        solution(people, nskills, cp+1, onesol, (smask|people[cp])); // old masks and current person mask
        // remove once done
        onesol.remove(onesol.size()-1);
    }

}
