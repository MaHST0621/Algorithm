package AcWing;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vk = scanner.nextInt();
        int va = scanner.nextInt();
        int jg = 0;
        int i = 0;
        while (true){
            i++;
            if  (jg == 0 ) {
                jg = 1;
                vk -= i;
            } else {
                jg = 0;
                va -= i;
            }

            if (vk < 0) {
                System.out.println("Vladik");
                break;
            }
            if (va < 0) {
                System.out.println("Valera");
                break;
            }
        }
    }
}
