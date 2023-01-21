package implementation;

import java.util.Scanner;

public class BirthdayChocolate {
    static int solve(int n, int[] s, int d, int m){
        int counter = 0;
        int sum = 0;
        for(int i = 0; i < s.length; i++) {
            for(int j = 0; j < m; j++) {
                sum += s[i+j]; 
                if (i+j+1 >= s.length) {
                    j = m+1;
                    i = s.length + 1;
                } 
            }
            if (sum == d) counter++;  
            sum = 0;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
