public class SumasSucesivasEj5 {
    public int calcularSuma(int num1, int num2){
        if (num2 == 0){
            return 0;
        }else{
            return num1 + calcularSuma(num1, num2 - 1);
        }
    }
    
}
