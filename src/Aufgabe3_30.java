import Prog1Tools.IOTools;

public class Aufgabe3_30 {
    public static void main(String[] args) {
        int geheimZahl = (int) (99 * Math.random() + 1);
        int tipp = -1;
        int versuch = 0;
        System.out.println("Willkommen beim Zahlenraten.");
        System.out.println("Ich denke mir eine Zahl zwischen 1 und 100. Rate diese Zahl!");
        while (tipp != geheimZahl) {
            versuch++;
            System.out.print(versuch+". Versuch: ");
            tipp = IOTools.readInt();
            if (tipp < geheimZahl) {
                System.out.println("Meine Zahl ist grösser!");}
            if (tipp > geheimZahl){
                System.out.println("Meine Zahl ist kleiner!");}
        }
        System.out.println("Du hast meine Zahl im " + (versuch) + ". Versuch erraten!");
    }
}
