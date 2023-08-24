public class SumaEnterosPositivosEj2 {
    public int calcularSuma(int num) throws Excepciones{
        if (num <= 0){
            throw new Excepciones("El numero tiene que ser mayor o igual a 1");
        }else{
            if (num != 1){
            return num + calcularSuma(num-1);
            }else{
                return 1;
            }
        }
    }
}
