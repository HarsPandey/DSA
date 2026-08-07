public class Palindrome {

    static boolean checkPalindrome(String text) {

        String formatted = text.toLowerCase().replaceAll("[^a-z0-9]", "");

        int front = 0;
        int back = formatted.length() - 1;

        while (front < back) {

            if (formatted.charAt(front) != formatted.charAt(back)) {
                return false;
            }

            front++;
            back--;
        }

        return true;
    }

    public static void main(String[] args) {

        String sentence = "A man a plan a canal Panama";

        System.out.println(checkPalindrome(sentence));
    }
}
