public class Aufgabe3_18 {
    public static void main(String[] args) {
            for(int i = 0; i < 100; i++) {
            if(i == 74) break;
            if(i % 9 != 0) continue;
            System.out.println(i);
            }
            int i = 0;
            while(true) { // Endlosschleife ?
                i++;
                int j = i * 30;
                if(j == 1260) break;
                if(i % 10 != 0) continue;
                System.out.println(i);
                }
            }
    }
