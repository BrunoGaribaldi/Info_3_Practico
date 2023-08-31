public class ShellSort {
    private int a[];
    
    public ShellSort (int a[]){
        this.a = a;
    }
    
    public int[] metodo (){
        long startTime = System.nanoTime();
        int intervalo, i,j,temp, n = a.length;
        
        for(intervalo = n/2 ; intervalo > 0 ; intervalo /= 2){
           for(i = intervalo ; i < n ; i++){
               for(j = i-intervalo ; j >= 0 && a[j] > a[j+intervalo] ; j -= intervalo ){
                   temp = a[j];
                   a[j] = a[j+intervalo]; 
                   a[j+intervalo] = temp;
               }
           } 
        }
        long endTime = System.nanoTime();
        System.out.print((endTime - startTime)/1000 + "ms");
        return a;
    } 
}
