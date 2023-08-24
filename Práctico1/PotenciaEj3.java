public class PotenciaEj3 {
    public int calcularPotencia (int base, int exponente){
        if (exponente == 0){
            return 1;
        }else{
            System.out.println(base);
            return base * calcularPotencia(base, exponente - 1);
        }
            
    }
}
