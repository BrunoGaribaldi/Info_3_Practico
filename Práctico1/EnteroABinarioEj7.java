public class EnteroABinarioEj7{
    public int conversor (int num, String bin) throws Excepciones {
        if (num==1) {
            bin=1+bin;
            System.out.println(bin);
            return 1;
        } else if (num>1) {
            bin=num%2+bin+"";
            return conversor(num/2, bin);
        } else {
            throw new Excepciones ("El numero ingresado no es valido");
        }
    }

}
