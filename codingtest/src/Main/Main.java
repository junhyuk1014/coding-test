package Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int start_idx = 0;
        int end_idx = n - 1;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        while(start_idx < end_idx){
            if(arr[start_idx] + arr[end_idx] == m){
                count++;
                start_idx ++;
                end_idx --;
            }
            else if(arr[start_idx] + arr[end_idx] > m){
                end_idx--;
                }
            else{
                start_idx++;
            }
        }

    System.out.println(count);


    }
}