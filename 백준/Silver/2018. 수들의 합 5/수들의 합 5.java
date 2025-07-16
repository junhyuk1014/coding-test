import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 1, sum = 1, endidx = 1, startidx = 1;
    while(endidx != n){
        if(sum>n) {
            sum -= startidx;
            startidx++;
        }
        else if(sum<n) {
            endidx++;
            sum += endidx;
        }
        else{
            endidx++;
            sum += endidx;
            count++;
        }
    }
    System.out.println(count);


    }
}