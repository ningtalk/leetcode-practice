package practice.part02;

import practice.utils.PrintUtil;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author np
 * @date 2020/9/13
 */
public class TopK {

    public static void main(String[] args) {
        int[] array = new int[]{78, 2, 3, 8, 4, 6, 5, 7, 66};
        PrintUtil.printArray(array);

        int[] topArray = topK(array, 4);
        PrintUtil.printArray(topArray);

    }

    public static int[] topK(int[] array, int k) {
        Queue<Integer> queue = new PriorityQueue(k);


        for (int e : array) {
            queue.add(e);
        }

        int[] result = new int[k];
        for (int i = 0 ; i < k; i++) {
            result[i] = queue.poll();
        }

        return result;
    }


    class Heap {
        int[] array;

    }
}
