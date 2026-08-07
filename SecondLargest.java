public class SecondLargest {

    static int findSecondLargest(int[] numbers) {

        int biggest = Integer.MIN_VALUE;
        int nextBiggest = Integer.MIN_VALUE;

        for (int current : numbers) {

            if (current > biggest) {
                nextBiggest = biggest;
                biggest = current;
            } else if (current > nextBiggest && current != biggest) {
                nextBiggest = current;
            }
        }

        return nextBiggest;
    }

    public static void main(String[] args) {

        int[] values = {12, 35, 1, 10, 34, 1};

        System.out.println(findSecondLargest(values));
    }
}
