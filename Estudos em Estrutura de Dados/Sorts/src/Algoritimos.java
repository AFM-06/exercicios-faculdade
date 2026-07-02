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
}
