import java.util.Arrays;

public class RotateArray {

    static void rotate(int[] data, int positions) {

        int size = data.length;
        positions %= size;

        reverse(data, 0, size - 1);
        reverse(data, 0, positions - 1);
        reverse(data, positions, size - 1);
    }

    static void reverse(int[] data, int first, int last) {

        while (first < last) {

            int tempValue = data[first];
            data[first] = data[last];
            data[last] = tempValue;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5, 6, 7};

        rotate(values, 3);

        System.out.println(Arrays.toString(values));
    }
}
