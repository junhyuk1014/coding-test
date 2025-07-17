import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuffer count = new StringBuffer();
        Stack<Integer> stackInt = new Stack<>();
        int[] input = new int[num];
        int lastinput = 0;
        for(int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }
        for(int i = 0; i < num; i++) {
            if(input[i] > lastinput) {
                for(int j = lastinput + 1; j < input[i] + 1; j++) {
                    stackInt.push(j);
                    count.append("+\n");
                }
                lastinput = input[i];
            }
            if(input[i] == stackInt.peek()) {
                stackInt.pop();
                count.append("-\n");
            } else {
                System.out.println("NO");
                return ;
            }
        }
        System.out.println(count.toString());


    }
}