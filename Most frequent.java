import java.util.*;

public class MostFrequent {

    static char findCharacter(String word) {

        Map<Character, Integer> countMap = new HashMap<>();

        for (char letter : word.toCharArray()) {
            countMap.put(letter, countMap.getOrDefault(letter, 0) + 1);
        }

        char answer = word.charAt(0);
        int highestCount = 0;

        for (Map.Entry<Character, Integer> item : countMap.entrySet()) {

            if (item.getValue() > highestCount) {
                highestCount = item.getValue();
                answer = item.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(findCharacter("mississippi"));
    }
}
