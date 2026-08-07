import java.util.Arrays;

public class TwoSum {

    static int[] findPair(int[] values, int targetValue) {

        int leftPointer = 0;
        int rightPointer = values.length - 1;

        while (leftPointer < rightPointer) {

            int total = values[leftPointer] + values[rightPointer];

            if (total == targetValue)
                return new int[]{values[leftPointer], values[rightPointer]};

            if (total < targetValue)
                leftPointer++;
            else
                rightPointer--;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 6, 8, 11};

        System.out.println(Arrays.toString(findPair(numbers, 10)));
    }
}
