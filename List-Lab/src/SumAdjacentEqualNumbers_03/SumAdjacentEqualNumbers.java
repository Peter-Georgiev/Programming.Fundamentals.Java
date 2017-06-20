package SumAdjacentEqualNumbers_03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> input =
                DoubleStream.of(Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray())
                .boxed().collect(Collectors.toCollection(ArrayList::new));

        for (int i = 1; i < input.size(); i++) {
            if (input.get(i - 1).equals(input.get(i))) {
                input.set(i - 1, input.get(i - 1) + input.get(i - 1));
                input.remove(i);
                i = 0;
            }
        }
        System.out.println(input.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
