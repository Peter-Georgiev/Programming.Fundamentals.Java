package MinMethod_02;

import java.util.Scanner;

/**
 * Created by Peter on 15.06.2017.
 */
public class MinMethod_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = Long.valueOf(scanner.nextLine());
        long num2 = Long.valueOf(scanner.nextLine());
        long num3 = Long.valueOf(scanner.nextLine());

        System.out.println(getMin(num1, getMin(num2, num3)));
    }

    static long getMin(long num1, long num2){
        return Math.min(num1, num2);
    }
}
