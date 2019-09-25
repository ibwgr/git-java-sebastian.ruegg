public class Aufgabe3_27 {
    public static void main(String[] args) {
        int zahl;
        int rest;
        String ziffer = "";

        zahl = IOTools.readInt("Positive Ganzzahl: ");
        while (zahl < 0){
            System.out.println("Die Zahl ist nicht positiv...");
            zahl = IOTools.readInt("Jetzt positive Ganzzahl bitte: ");
        }

        System.out.print("Zerlegt rückwärts: ");
        while (zahl !=0){
            rest = zahl % 10;
            zahl = zahl / 10;
            switch (rest){
                case 1: ziffer = "eins"; break;
                case 2: ziffer = "zwei"; break;
                case 3: ziffer = "drei"; break;
                case 4: ziffer = "vier"; break;
                case 5: ziffer = "fünf"; break;
                case 6: ziffer = "sechs"; break;
                case 7: ziffer = "sieben"; break;
                case 8: ziffer = "acht"; break;
                case 9: ziffer = "neun"; break;
                case 0: ziffer = "null"; break;
            }
            System.out.print(ziffer + " ");
        }
        System.out.println();
    }
}
