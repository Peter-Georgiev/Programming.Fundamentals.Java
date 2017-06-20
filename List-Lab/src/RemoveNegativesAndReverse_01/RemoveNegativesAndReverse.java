package RemoveNegativesAndReverse_01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Peter on 20.06.2017.
 */
public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = IntStream.of(Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray())
                .boxed().collect(Collectors.toCollection(ArrayList::new));

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) < 0) {
                input.remove(i);
                i--;
            }
        }

        Collections.reverse(input);

        if (input.size() == 0){
            System.out.println("empty");
        }
        else {
            input.stream().forEach(a -> System.out.print(a + " "));
        }
    }
}
