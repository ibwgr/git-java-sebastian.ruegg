public class Aufgabe3_24 {
    public static void main(String[] args) {
        int zeilen = IOTools.readInteger("Anzahl Zeilen: ");
        for (int i = 1; i <= zeilen; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
