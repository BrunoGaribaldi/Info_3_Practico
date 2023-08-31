//Ejercicio 3
import java.util.Random;

public class RandomArray {
    
     public int[] randomarray (int arraySize){
        Random random = new Random();
        int a[] = new int[arraySize];
     
        for (int i = 0; i < arraySize; i++) {
        a[i] = random.nextInt(1000);
        }
        return a;
    }
}
   