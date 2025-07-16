import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] score = new int[num];

    for (int i = 0; i < num; i++) {
        score[i] = sc.nextInt();
    }
    Arrays.sort(score);
    int max = score[num - 1];
        float[] new_score = new float[num];
    float sum = 0;
        for(int i = 0; i < num; i++) {
        new_score[i] = ((float)score[i]/(float)max)*100;
        sum+=new_score[i];
        if(i == num-1){
            float average = sum/num;
            System.out.print(average);
            break;
        }
    }

    }
}