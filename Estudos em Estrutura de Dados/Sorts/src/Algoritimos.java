import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Algoritimos {
    private int[] array = new int[20];
    public Algoritimos(){
        Random random = new Random();
        for(int i = 0; i < this.array.length; i++){
            this.array[i] = random.nextInt(100);
        }
    }
    public void buubleSort(){
        System.out.println(Arrays.toString(array));
        int size = array.length;
        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size - 1 - i;j++){
                if(array[j]>array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public void selectionSort(){
        System.out.println(Arrays.toString(array));
        int size = array.length;
        for(int i = 0; i < size - 1; i++){
            int indiceMenor = i;
            for(int j = i + 1; j < size; j++){
                if(array[j]<array[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if(indiceMenor != i){
                int aux = array[i];
                array[i] = array[indiceMenor];
                array[indiceMenor] = aux;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public void insertionSort(){
        System.out.println(Arrays.toString(array));
        int size = array.length;
        for(int i = 1; i < size; i++){
            int j = i;
            while (j > 0 && array[j - 1] > array[j]){
                int aux = array[j];
                array[j] = array[j - 1];
                array[j - 1] = aux;
                j = j - 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public void mergeSort(){

        System.out.println(Arrays.toString(array));
        if (array.length > 1) {
            mergeSortHelper(0, array.length - 1);
        }
        System.out.println(Arrays.toString(array));
    }

    private void mergeSortHelper(int head, int tail){
        if(head < tail){
            int middle = (head + tail)/2;
            mergeSortHelper(head, middle);
            mergeSortHelper(middle + 1, tail);
            merge(head, middle, tail);
        }
    }
    private void merge(int head, int middle, int tail) {
        int[] temp = new int[tail - head + 1];

        int leftIndex  = head;
        int rightIndex = middle + 1;
        int tempIndex  = 0;

        while (leftIndex <= middle && rightIndex <= tail) {

            if (array[leftIndex] <= array[rightIndex]) {
                temp[tempIndex] = array[leftIndex];
                leftIndex++; // Move the left pointer forward
            }
            else {
                temp[tempIndex] = array[rightIndex];
                rightIndex++; // Move the right pointer forward
            }
            tempIndex++;
        }

        while (leftIndex <= middle) {
            temp[tempIndex] = array[leftIndex];
            leftIndex++;
            tempIndex++;
        }

        while (rightIndex <= tail) {
            temp[tempIndex] = array[rightIndex];
            rightIndex++;
            tempIndex++;
        }
        for (int position = head; position <= tail; position++) {
            array[position] = temp[position - head];
        }
    }

    public void bucketSort() {
        System.out.println(Arrays.toString(array));
        int size = array.length;
        int k = 5;

        ArrayList<Integer>[] buckets = new ArrayList[k];
        for (int position = 0; position < k; position++) {
            buckets[position] = new ArrayList<>();
        }

        int maxValue = array[0];
        for (int position = 1; position < size; position++) {
            if (array[position] > maxValue) {
                maxValue = array[position];
            }
        }
        int M = maxValue + 1;

        for (int position = 0; position < size; position++) {
            int bucketIndex = (int) ((double) k * array[position] / M);
            buckets[bucketIndex].add(array[position]);
        }

        for (int position = 0; position < k; position++) {
            insertionSortBucket(buckets[position]);
        }

        int currentIndex = 0;
        for (int position = 0; position < k; position++) {
            for (int element : buckets[position]) {
                array[currentIndex] = element;
                currentIndex = currentIndex + 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    private void insertionSortBucket(ArrayList<Integer> bucket) {
        int bucketSize = bucket.size();
        for (int current = 1; current < bucketSize; current++) {
            int key = bucket.get(current);
            int scan = current - 1;
            while (scan >= 0 && bucket.get(scan) > key) {
                bucket.set(scan + 1, bucket.get(scan));
                scan = scan - 1;
            }
            bucket.set(scan + 1, key);
        }
    }
}
