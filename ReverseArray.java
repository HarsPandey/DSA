import java.util.Arrays;

public class ReverseArray {

    static void reverse(int[] numbers) {
        int startIndex = 0;
        int endIndex = numbers.length - 1;

        while (startIndex < endIndex) {
            int swapValue = numbers[startIndex];
            numbers[startIndex] = numbers[endIndex];
            numbers[endIndex] = swapValue;

            startIndex++;
            endIndex--;
        }
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};

        reverse(values);

        System.out.println(Arrays.toString(values));
    }
}
