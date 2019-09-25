public class Aufgabe3_28 {
    public static void main(String[] args) {
        int zahl = IOTools.readInt("Bitte positive Ganzzahl: ");
        System.out.print("Die Vielfachen: ");
        for (int i = 1; i<11; i++){
            System.out.print((i*zahl)+ " ");
        }
    }
}
