public class Ejercicio4 {
    public static void main(String[] args) {
        int a100[]; 
        int a1000[];
        int a10000[];
        RandomArray random = new RandomArray();
        a100 = random.randomarray(100);
        a1000 = random.randomarray(1000);
        a10000 = random.randomarray(10000);
        
        Quicksort q100 = new Quicksort(a100);
        Quicksort q1000 = new Quicksort(a1000);
        Quicksort q10000 = new Quicksort(a10000);
        Insercion in100 = new Insercion(a100);
        Insercion in1000 = new Insercion(a1000);
        Insercion in10000 = new Insercion(a10000);
        ShellSort sh100 = new ShellSort(a100);
        ShellSort sh1000 = new ShellSort(a1000);
        ShellSort sh10000 = new ShellSort(a10000);
        
        
        //tabla
        System.out.println("Cant.datos\t-----------------------------------------");
        System.out.println("\t\tQuicksort\tShellSort\tInsercion");
        System.out.print("100    |\t");
        q100.metodo();
        System.out.print("\t\t");
        sh100.metodo();
        System.out.print("\t\t");
        in100.metodo();
        System.out.println("\n");
        System.out.print("1000   |\t");
        q1000.metodo();
        System.out.print("\t\t");
        sh1000.metodo();
        System.out.print("\t\t");
        in1000.metodo();
        System.out.println("\n");
        System.out.print("10000  |\t");
        q10000.metodo();
        System.out.print("\t\t");
        sh10000.metodo();
        System.out.print("\t\t");
        in10000.metodo();
        System.out.println("\n");
    }
}
