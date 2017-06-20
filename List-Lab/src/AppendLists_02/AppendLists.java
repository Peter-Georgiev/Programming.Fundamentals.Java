package AppendLists_02;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.asList(scanner.nextLine().split("\\|"));
        ArrayList<String> printInput = new ArrayList<>();

        for (int i = input.size() - 1; i >= 0; i--) {
            printInput.add(input.get(i).trim());
        }

        System.out.println(printInput.stream().collect(Collectors.joining(" ")));
    }
}
