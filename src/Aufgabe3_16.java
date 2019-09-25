public class Aufgabe3_16 {
    public static void main(String[] args) {
        //Codeausschnitt aus Buch
        System.out.println("Lösung mit while loop aus Buch");
        int i = 20;
        while (i > 0) {
            System.out.println(i);
            i -= 2;
        }
        System.out.println();
        System.out.println("Meine Lösung mit for loop");
        //meine Lösung mit for loop
        for (int ii=20; ii > 0; ii -=2){
            System.out.println(ii);
        }

    }
}
