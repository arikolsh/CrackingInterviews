package problemsolving.algo;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class MinBinaryHeap {

    int[] arr = new int[10];
    int heapSize = 0;

    int min() {
        assert (size() > 0);
        return arr[0];
    }

    int size() {
        return heapSize;
    }

    int capacity() {
        return arr.length;
    }

    boolean add(int val) {
        if (arr.length == heapSize) {
            return false;
        }
        heapSize++;
        arr[heapSize - 1] = val; //put at the bottom level
        heapifyUp(heapSize - 1);
        return true;
    }

    void deleteMin() {
        if (heapSize == 0) {
            return;
        }
        swap(0, heapSize - 1);
        heapSize--;
        heapifyDown(0);

    }

    private void heapifyUp(int index) {
        while (index >= 1 && arr[index / 2] > arr[index]) {
            swap(index / 2, index);
            index /= 2;
        }
    }

    private void heapifyDown(int index) {
        while (leftChild(index) < heapSize) {
            int smallerIndex = leftChild(index);
            if (rightChild(index) < heapSize && arr[rightChild(index)] < arr[smallerIndex]) {
                smallerIndex = rightChild(index);
            }
            if (arr[smallerIndex] < arr[index]) {
                swap(smallerIndex, index);
                index = smallerIndex;
            } else {
                break;
            }
        }
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    private void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public String toString() {
        StringBuilder strBuf = new StringBuilder();
        Queue<Integer> currLevel = new LinkedList<>();
        currLevel.add(0);
        Queue<Integer> nextLevel;
        while (true) {
            nextLevel = new LinkedList<>();
            while (!currLevel.isEmpty()) {
                int curr = currLevel.poll();
                if (leftChild(curr) < heapSize) {
                    nextLevel.add(leftChild(curr));
                }
                if (rightChild(curr) < heapSize) {
                    nextLevel.add(rightChild(curr));
                }
                strBuf.append(arr[curr] + " ");
            }
            strBuf.append("\n");
            if (nextLevel.isEmpty()) break;
            currLevel = nextLevel;
        }
        return strBuf.toString();
    }


    @Test
    public void t() {
        MinBinaryHeap binh = new MinBinaryHeap();
        binh.add(5);
        binh.add(10);
        binh.add(1);
        binh.add(3);
        System.out.println(binh);

    }
}

