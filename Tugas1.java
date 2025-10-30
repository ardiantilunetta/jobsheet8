import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3) : ");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            if (n < 3) {
                    System.out.println("Input yang dapat dimasukkan minimal 3");
                    break;
                }
            for (int j = 1 ; j <= n ; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}