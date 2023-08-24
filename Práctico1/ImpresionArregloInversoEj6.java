public class ImpresionArregloInversoEj6 {
    private int a[];
    
    private int impresion(int l)
    {
        if(l == -1)
        {
            return 0;
            
        }else{
            
            System.out.println(a[l]);
            return impresion(l-1);
        }
    }
            
    public void imprimir (int[] arreglo){
        this.a = arreglo;
        int longitud = a.length - 1;
        impresion( longitud );
    }
}
