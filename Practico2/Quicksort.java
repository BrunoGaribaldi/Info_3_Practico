public class Quicksort {
    private int item[];
    private int right;
    private int left;

    public Quicksort(int[] item) {
        this.item = item;
        right = item.length-1;
        left = 0;
    }
    
    public int[] metodo (){
        long startTime = System.nanoTime();
        item = quicksort(item,left,right);
        long endTime = System.nanoTime();
        System.out.print((endTime - startTime)/1000 + "ms");
        return item;
        
    }
    
    private int[] quicksort(int item[] , int left , int right ){
        
        int i, j, temp;
        i = left;
        j = right;
   do {
      while ( item [j] > item [i] && j>i) j-- ;
      if ( i<j ) {
         temp=item[i];
         item[i] = item[j];
         item[j] = temp;
         i++;
     }
      while ( item [i] < item [j] && i<j ) i++ ;
      if ( i<j ) {
         temp=item[i];
         item[i] = item[j];
         item[j] = temp;
         j--;
     }
   } while ( i<j );
        if ( left < j ) quicksort (item, left, j-1 );
        if ( i < right ) quicksort ( item, i+1, right );
       
        return item;
    }    
}
