package ShootListElements_01;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Peter on 27.06.2017.
 */
public class ShootListElements {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int lastRemove = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                if (elements.size() == 0) {
                    System.out.println("shot them all. last one was " + lastRemove);
                    break;
                }
                System.out.println("survivors: " + elements.stream().map(Object::toString).collect(Collectors.joining(" ")));
                break;
            } else if (input.equals("bang") && elements.size() == 0) {
                System.out.println("nobody left to shoot! last one was " + lastRemove);
                break;
            }

            if (Character.isDigit(input.charAt(0))) {
                int numberToAdd = Integer.parseInt(input);
                elements.add(0, numberToAdd);
                continue;
            }
            double average = elements.stream().mapToDouble(Double::valueOf).average().getAsDouble();

            for (int i = 0; i <= elements.size(); i++) {
                if (elements.get(i) < average) {
                    lastRemove = elements.get(i);
                    elements.remove(i);
                    System.out.println("shot " + lastRemove);
                    break;
                } else if (elements.size() == 1) {
                    lastRemove = elements.get(0);
                    elements.remove(0);
                    System.out.println("shot " + lastRemove);
                    break;
                }
            }

            for (int i = 0; i < elements.size(); i++) {
                elements.set(i, elements.get(i) - 1);
            }
        }
    }
}
