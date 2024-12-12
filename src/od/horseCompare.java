package od;

import java.util.Arrays;
import java.util.Scanner;

public class horseCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] numsA = new int[cnt];
        int[] numsB = new int[cnt];
        for (int i = 0; i < cnt; i++)
            numsA[i] = in.nextInt();
        for (int i = 0; i < cnt; i++)
            numsB[i] = in.nextInt();
        Arrays.sort(numsA);
        Arrays.sort(numsB);
        int Amin = 0, Amax = cnt - 1;
        int Bmin = 0, Bmax = cnt - 1;
        int res = 0;
        while (Amin <= Amax) {
            if (numsA[Amin] < numsB[Bmin]) {res--;Bmax--;Amin++;}
            else if (numsA[Amin] > numsB[Bmin]) {res++;Amin++;Bmin++;}
            else {if (numsA[Amin] < numsB[Bmax]) res--;
                Amin++;Bmax--;}
        }
        System.out.println(res);
    }
}
