import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int a =  sc.nextInt();
   int b = sc.nextInt();

   int[][] array = new int[a+1][a+1];
   int[][] sum = new int[a+1][a+1];

        for(int i = 1; i < a+1; i++) { //입력받기
       for(int j = 1; j < a+1; j++) {
           array[i][j] = sc.nextInt();
       }
   }
        for(int i = 1; i < a+1; i++) {
            for(int j = 1; j < a+1; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + array[i][j];
            }
        }
        int[] x1 = new int[b];
   int[] y1 = new int[b];
   int[] x2 = new int[b];
   int[] y2 = new int[b];
   int[] result = new int[b];
   for(int i = 0; i < b; i++) {
       x1[i] = sc.nextInt();
       y1[i] = sc.nextInt();
       x2[i]  = sc.nextInt();
       y2[i]  = sc.nextInt();

       int x11 = x1[i],  y11 = y1[i],  x12 = x2[i], y12 = y2[i];
       result[i] = sum[x12][y12] - sum[x11-1][y12] - sum[x12][y11-1] + sum[x11-1][y11-1];
       if(i == b-1){
           for( int j = 0; j < b; j++) {
               System.out.println(result[j]);
           }
       }
   }

    }
}