public class BinarySearch {

    static int search(int[] numbers, int key) {

        int lowIndex = 0;
        int highIndex = numbers.length - 1;

        while (lowIndex <= highIndex) {

            int middle = lowIndex + (highIndex - lowIndex) / 2;

            if (numbers[middle] == key)
                return middle;

            if (numbers[middle] < key)
                lowIndex = middle + 1;
            else
                highIndex = middle - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] values = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        System.out.println(search(values, 23));
    }
}
