import Prog1Tools.IOTools;

public class Aufgabe3_32 {
    public static void main(String[] args) {
        int zeilen = IOTools.readInt("Anzahl der Zeilen: ");

        for (int i = zeilen; i>0 ; i--){
            for (int j = i; j > 0; j--){
                System.out.print(" ");
                }
            for (int k = (zeilen * 2) - (i*2 -1); k > 0; k-- ){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = zeilen; l > 0; l-- ){
            System.out.print(" ");
        }
        System.out.println("I");
    }
}
