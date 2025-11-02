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

            System.out.print("Masukkan nama pemain cabor tenis meja : ");
            for (int k=1 ; k<=5 ; k++) {
                System.out.print(k+". ");
                tenis += sc.nextLine();
            }

            System.out.print("Masukkan nama pemain cabor basket : ");
            for (int l=1 ; l<=5 ; l++) {
                System.out.print(l+". ");
                basket += sc.nextLine();
            }

            System.out.print("Masukkan nama pemain cabor voly : ");
            for (int m=1 ; m<=5 ; m++) {
                System.out.print(m+". ");
                voly += sc.nextLine();
            }
        }

        System.out.println(badminton);
        System.out.println(tenis);
        System.out.println(basket);
        System.out.println(voly);
        
    }
}