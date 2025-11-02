import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        String badminton = " ", tenis = " ", basket = " ", voly = " ";

        System.out.print("Masukkan jumlah politeknik : ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i=1 ; i<=n ; i++){
            System.out.println("Masukkan nama pemain cabor Badminton : ");
            for (int j=1 ; j<=5 ; j++) {
                System.out.print(j+". ");
                badminton += sc.nextLine();
            }
        }

        System.out.println(badminton);

        
    }
}