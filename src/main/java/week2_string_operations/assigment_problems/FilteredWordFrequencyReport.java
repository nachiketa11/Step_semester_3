package week2_string_operations.assigment_problems;

import java.util.*;

public class FilteredWordFrequencyReport {

    private static final Set<String> STOP_WORDS = new HashSet<>(
            Arrays.asList("the", "was", "and", "a", "is", "of", "in")
    );

    public static void printFilteredWordFrequency(String feedback) {
        if (feedback == null || feedback.trim().isEmpty()) {
            System.out.println("Empty Feedback");
            return;
        }

        // Normalize text: lowercase and replace punctuation
        String cleaned = feedback.toLowerCase().replaceAll("[,.]", "");
        String[] words = cleaned.split("\\s+");

        Map<String, Integer> freqMap = new HashMap<>();

        for (String w : words) {
            if (w.isEmpty() || STOP_WORDS.contains(w)) {
                continue;
            }
            freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
        }

        // Sort by frequency descending
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for (Map.Entry<String, Integer> entry : list) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        String feedback = "The mentor was great, the session was great and clear.";
        System.out.println("=== Stop-Word-Filtered Word Frequency Report ===");
        printFilteredWordFrequency(feedback);
    }
}
