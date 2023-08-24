public class ImpresionRegresivaEj4 {
    public int contar (int num){
        if (num == 0){
            return 1;
        }else{
            System.out.println(num);
            return contar(num-1);   
        }
                 
    }
}
