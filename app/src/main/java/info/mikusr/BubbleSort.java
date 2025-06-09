package info.mikusr;

import java.util.Arrays;

import info.mikusr.utils.Speak;

public class BubbleSort {
    public static void main(String[] args) {
        Speak.sayHello();
        int[] numbers = { 5, 1, 4, 2, 3, 0, 1 };
        int[] sortedNumbers = Sorter.sort(numbers, true);
        System.out.println("unsorted");
        System.out.println(Arrays.toString(numbers));
        System.out.println("sorted");
        System.out.println(Arrays.toString(sortedNumbers));
    }

}

class Sorter {
    public static int[] sort(int[] array, boolean debug) {
        int length = array.length;
        int steps = 0;
        int[] arrayToSort = Arrays.copyOf(array, length);

        for (int i = 0; i < length - 1; i++) {
            if (debug) {
                System.out.println("i= " + i + " " + Arrays.toString(arrayToSort));
            }

            for (int j = 0; j < length - 1 - i; j++) {
                if (debug) {
                    steps++;
                }
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int swap = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = swap;
                }
            }

        }
        if (debug) {
            System.out.println("steps= " + steps);
        }
        return arrayToSort;
    }
}