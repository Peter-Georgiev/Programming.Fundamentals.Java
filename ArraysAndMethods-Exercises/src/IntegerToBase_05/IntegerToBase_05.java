package IntegerToBase_05;

import java.util.Scanner;

/**
 * Created by Peter on 15.06.2017.
 */
public class IntegerToBase_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int toBase = Integer.valueOf(scanner.nextLine());

        System.out.println(Integer.toString(number, toBase));
    }
}
