import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        String badminton = " ", tenis = " ", basket = " ", voly = " ";

        System.out.println("Masukkan nama pemain cabor Badminton : ");
        for (int i=1 ; i<= 5 ; i++) {
            System.out.print(i+". ");
            badminton += sc.nextLine();
        }

        System.out.println(badminton);
    }
}