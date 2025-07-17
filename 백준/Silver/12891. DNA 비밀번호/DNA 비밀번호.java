import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int countChar(String word, char ch){
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    public static void addChar(int[] window, char ch) {
        if (ch == 'A') window[0]++;
        else if (ch == 'C') window[1]++;
        else if (ch == 'G') window[2]++;
        else if (ch == 'T') window[3]++;
    }
    public static void removeChar(int[] window, char ch) {
        if (ch == 'A' && window[0] > 0) window[0]--;
        else if (ch == 'C' && window[1] > 0) window[1]--;
        else if (ch == 'G' && window[2] > 0) window[2]--;
        else if (ch == 'T' && window[3] > 0) window[3]--;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int pw_num =  sc.nextInt();
        String word = sc.next();
        int count = 0;
        int [] window = new int[4];
        int[] ACGT =  new int[4];
        for (int i = 0; i < ACGT.length; i++) {
            ACGT[i] = sc.nextInt();
        }
        for(int i = 0; i < pw_num; i++){
            addChar(window, word.charAt(i));
        }
        if(window[0] >= ACGT[0] && window[1] >= ACGT[1] && window[2] >= ACGT[2] && window[3] >= ACGT[3]){
            count ++;
        }
        for(int i = pw_num; i< length; i++){
            removeChar(window, word.charAt(i - pw_num));
            addChar(window, word.charAt(i));
            if(window[0] >= ACGT[0] && window[1] >= ACGT[1] && window[2] >= ACGT[2] && window[3] >= ACGT[3]){
                count ++;
            }

        }
    System.out.println(count);

    }
}