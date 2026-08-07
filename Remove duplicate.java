import java.util.*;

public class RemoveDuplicates {

    static String remove(String text) {

        StringBuilder output = new StringBuilder();

        Set<Character> visited = new LinkedHashSet<>();

        for (char letter : text.toCharArray()) {

            if (visited.add(letter))
                output.append(letter);
        }

        return output.toString();
    }

    public static void main(String[] args) {

        System.out.println(remove("programming"));
    }
} 
