import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        boolean[] not_print = new boolean[m];
        int[] result = new int[m];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
            not_print[i] = false;
            String n = sc.nextLine();
            if(n.contains("push")){
                not_print[i] = true;
                String p = n.substring(5);
                stack.push(parseInt(p));

            }
            else if(n.equals("pop")){
                if(stack.isEmpty()){
                    result[i] = -1;
                }
                else{
                    result[i] = stack.pop();
                }
            }
            else if(n.equals("size")){
                result[i] = stack.size();
            }
            else if(n.equals("empty")){
                if(stack.isEmpty()){
                    result[i] = 1;
                }
                else result[i] = 0;
            }
            else if(n.equals("top")){
                if(stack.isEmpty()){
                    result[i] = -1;
                }
                else result[i] = stack.peek();

            }

        }


        for(int i = 0; i < result.length; i++){
            if(not_print[i]){}
            else System.out.println(result[i]);
        }


    }
}