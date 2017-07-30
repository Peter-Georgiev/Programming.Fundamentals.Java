package A_OddOccurrences;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        String[] wordInput = scanner.nextLine().toLowerCase().split(" ");

        for (int i = 0; i < wordInput.length; i++) {
            if (!wordCount.containsKey(wordInput[i])) {
                wordCount.put(wordInput[i], 0);
            }
            wordCount.put(wordInput[i], wordCount.get(wordInput[i]) + 1);
        }

        ArrayList<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> word : wordCount.entrySet()) {
            if (word.getValue() % 2 == 1) {
                result.add(word.getKey());
            }
        }

        System.out.println(
                result
                .toString()
                .replace("[", "")
                .replace("]", "")
        );
    }
}
