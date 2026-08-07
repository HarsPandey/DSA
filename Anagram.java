import java.util.Arrays;

public class Anagram {

    static boolean checkAnagram(String firstWord, String secondWord) {

        if (firstWord.length() != secondWord.length())
            return false;

        char[] firstArray = firstWord.toCharArray();
        char[] secondArray = secondWord.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

    public static void main(String[] args) {

        System.out.println(checkAnagram("listen", "silent"));
    }
}
