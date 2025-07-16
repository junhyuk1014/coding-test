import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long count = 0;
    long[] sum = new long[n];
    long[] remain = new long[m];
    int remainder = 0;
    sum[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
        sum[i] = sum[i-1] + sc.nextInt();
    }

    for(int i = 0; i < n; i++) {
        remainder = (int)(sum[i] % m);
        if(remainder ==0){
            count++;
            remain[remainder] ++;
        }
        else remain[remainder] ++;
    }

    for(int i = 0; i < m; i++) {
        long combin = remain[i] * (remain[i] - 1) /2;
        count += combin;
    }
    System.out.println(count);
    }
}