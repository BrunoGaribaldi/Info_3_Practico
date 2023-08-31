public class Insercion {
    private int a[];
    
    public Insercion (int a[]){
        this.a = a;
    }
    
    public int[] metodo (){
        long startTime = System.nanoTime();
        int temp; 
        int j; 
        for (int p = 1 ; p < a.length ; p++){
            temp = a[p];
            j = p-1;
            while( j >= 0 && temp < a[j] ){
              a[j+1] = a[j];
              j--;
            }
            a[j+1] = temp;
        }
        long endTime = System.nanoTime();
        System.out.print((endTime - startTime)/1000 + "ms");
        return a;
    }
   
}
