package SortArrayOfStrings_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;

/**
 * Created by Peter on 27.06.2017.
 */
public class SortArrayOfStrings {
    public static void main(String[] args) throws IOException{
        boolean swapped;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        Collator frCollator = Collator.getInstance();

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j > 0){
                if (frCollator.compare(arr[j - 1], arr[j]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                j--;
            }
        }

        StringBuilder ab = new StringBuilder();
        for (String s : arr) {
            ab.append(s).append(" ");
        }

        System.out.println(ab);
    }
}
