import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] num = new int[n + 1];
    int[] sum = new int[n + 1];
    sum[0] = 0;
    for (int i = 1; i < n + 1; i++) {
        num[i] = sc.nextInt();
    }
    for (int i = 1; i < n + 1; i++) {
        sum[i] = sum[i-1] + num[i];
    }

        int[] left = new int[m];
        int[] right = new int[m];
        int[] total = new int[m];

        for (int i= 0; i < m; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        for (int i= 0; i < m; i++) {
            int sum_left = left[i];
            int sum_right = right[i];
            total[i] = sum[sum_right] - sum[sum_left-1];
            System.out.println(total[i]);

        }

    }
}