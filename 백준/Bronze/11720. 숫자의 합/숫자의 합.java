import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];
    String str = sc.next();
    int sum = 0;

        for(int i = 0; i<n; i++){
        num[i] = str.charAt(i);
        num[i] = num[i] - '0';

        sum += num[i];
        if(i == n-1){
            System.out.println(sum);
            break;
        }
    }

    }
}