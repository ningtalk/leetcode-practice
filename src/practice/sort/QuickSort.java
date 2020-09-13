package practice.sort;

/**
 * @author np
 * @date 2020/9/13
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{78, 2, 3, 8, 4, 6, 5, 7, 66};
//        int[] array = new int[]{2, 3, 3, 8, 4, 6, 5};
        printArray(array);

        sort(array, 0, array.length - 1);

        printArray(array);

    }


    public static void sort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }


        int index = partition(array, left,  right);
        System.out.println("index:" + index);


        sort(array, left, index - 1);
        sort(array, index + 1, right);


    }

    private static int partition(int[] array, int left, int right) {
        if (left >= right) {
            throw new IllegalArgumentException("left is bigger than right.");
        }

        if (array.length < 2) {
            return left;
        }

        int pivot = array[left];

        int i = left, j = right;
        while (i < j) {
            while (array[j] >= pivot && i < j) {
                j--;
            }

            if (i < j) {
                array[i] = array[j];
            }

            while (array[i] <= pivot && i < j) {
                i++;
            }

            if (i < j) {
                array[j] = array[i];
            }
        }

        array[i] = pivot;

        return i;
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + "\t");
        }

        System.out.println();
    }
}
