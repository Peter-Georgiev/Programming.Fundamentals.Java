package DebuggingExercise_MiningCoins_22;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Peter on 15.06.2017.
 */
public class MiningCoins_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());

        String decrypted = "";
        float totalValue = 0;
        //DecimalFormat df = new DecimalFormat();

        for (int i = 0; i < n; i++)
        {
            int number = Integer.valueOf(scanner.nextLine());

            int digit1 = number / 100;
            int digit2 = (number % 100) / 10;
            int digit3 = number % 10;

            totalValue += ((float) digit1 + digit2 + digit3) / (float) n;
            int ASCIICode = 0;

            if (i % 2 == 0)
            {
                ASCIICode = ((digit1 * 10) + digit3) - digit2;
            }
            else
            {
                ASCIICode = (digit1 * 10) + digit3 + digit2;
            }

            if ((ASCIICode >= 65 && ASCIICode <= 90)
                    || (ASCIICode >= 97 && ASCIICode <= 122))
            {
                decrypted += (char)ASCIICode;
            }
        }

        System.out.printf("Message: %s%n", decrypted);
        System.out.printf("Value: %.7f", totalValue);
    }
}