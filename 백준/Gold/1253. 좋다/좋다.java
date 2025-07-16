import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_count = 0;
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        Arrays.sort(m);

        for(int i = 0; i < n; i++){
            int end_idx = n - 1;
            int start_idx = 0;
            while (start_idx < end_idx) {
                if (m[start_idx] + m[end_idx] == m[i]) {
                    if(start_idx == i) {
                        start_idx++;
                        continue;
                    }
                    else if(end_idx == i) {
                        end_idx--;
                        continue;
                    }
                    total_count++;
                    break;
                } else if (m[start_idx] + m[end_idx] < m[i]) {
                    start_idx++;
                } else {
                    end_idx--;
                }

            }

        }
                                           System.out.println(total_count);


    }
}