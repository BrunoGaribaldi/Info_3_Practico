public class FactorialEj1 {

    public int calcularFactorial(int num){
        if (num != 1)
        {
            return num * calcularFactorial(num-1);
        }
        else
        {
            return 1;
        }
        
    }
}
