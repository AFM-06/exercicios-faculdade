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
}
