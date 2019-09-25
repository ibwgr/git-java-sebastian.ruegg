public class Aufgabe3_19 {
    public static void main(String[] args) {
    int n, i;
    n = IOTools.readInteger("Gib eine Zahl ein: ");

            System.out.println("for loop");
        for (i = 3;i<2*n; i++ ){
            System.out.println(1.0/(2*i+1));
        }
        System.out.println();
        System.out.println("while loop");
        i = 3;
        while (i<2*n){
            System.out.println(1.0/(2*i+1));
            i++;
        }
        System.out.println();
        System.out.println("do while loop");
        i = 3;
        do {
            System.out.println(1.0/(2*i+1));
            i++;
        }
        while (i<2*n);
    }
}
