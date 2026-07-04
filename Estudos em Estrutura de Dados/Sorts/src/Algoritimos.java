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
}
