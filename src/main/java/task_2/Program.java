package task_2;

/*
/  Найти НОП
 */

import java.util.*;


public class Program {

    static int[] x;
    static int[] y;
    static int[][] dp;

    static int n, m;


    public static void main(String[] args) {

        System.out.println("Введите размер первой последовательности: ");
        Scanner con = new Scanner(System.in);
        n = con.nextInt();
        x = new int[n + 1];
        System.out.println("Введите данные первой последовательности.");
        for (int i = 1; i <= n; i++)
            x[i] = con.nextInt();

        System.out.println("Введите размер второй последовательности: ");
        m = con.nextInt();
        y = new int[m + 1];
        System.out.println("Введите данные второй последовательности.");
        for (int i = 1; i <= m; i++)
            y[i] = con.nextInt();

        dp = new int[2][m + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                if (x[i] == y[j])
                    dp[i % 2][j] = 1 + dp[(i - 1) % 2][j - 1];
                else
                    dp[i % 2][j] = Math.max(dp[(i - 1) % 2][j], dp[i % 2][j - 1]);


        System.out.println("Наибольшая общая последовательность равна: " + dp[n % 2][m]);
        con.close();

    }

}
