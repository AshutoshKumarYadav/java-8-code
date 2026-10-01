import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sequence {

    public static void main(String[] args) {
        String input = "1 2 3  5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1";
        System.out.println(findContinuousSequences(input));
    }

    private static String findContinuousSequences(String input) {
        if (input == null || input.isEmpty()) return "Invalid Input";

        List<Integer> numbers = new ArrayList<>();
        for (String s : input.split(" ")) {
            try {
                numbers.add(Integer.parseInt(s.trim())); // Extract valid integers
            } catch (NumberFormatException ignored) {
                // Ignore non-numeric values
            }
        }
        if (numbers.isEmpty()) return "No valid numbers found";

        // Sort negative and positive numbers separately
        List<Integer> negatives = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();
        for (int num : numbers) {
            if (num < 0) negatives.add(num);
            else positives.add(num);
        }

        Collections.sort(negatives); // Sort negatives (smallest to largest)
        Collections.sort(positives); // Sort positives

        return mergeConsecutive(negatives) + (negatives.isEmpty() || positives.isEmpty() ? "" : ",") + mergeConsecutive(positives);
    }

    private static String mergeConsecutive(List<Integer> numbers) {
        if (numbers.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        int n = numbers.size();
        
        for (int i = 0; i < n; i++) {
            result.append(numbers.get(i));
            if (i < n - 1 && numbers.get(i) + 1 == numbers.get(i + 1)) {
                continue; // Skip comma for consecutive numbers
            }
            if (i < n - 1) {
                result.append(",");
            }
        }
        return result.toString();
    }
}
