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

            System.out.println("POLITEKNIK "+i);

            System.out.println("Masukkan nama atlet cabor Badminton : ");
            for (int j=1 ; j<=5 ; j++) {
                System.out.print(j+". ");
                badminton += sc.nextLine() + ", ";
            }

            System.out.println("Masukkan nama atlet cabor tenis meja : ");
            for (int k=1 ; k<=5 ; k++) {
                System.out.print(k+". ");
                tenis += sc.nextLine() + ", ";
            }

            System.out.println("Masukkan nama atlet cabor basket : ");
            for (int l=1 ; l<=5 ; l++) {
                System.out.print(l+". ");
                basket += sc.nextLine() + ", ";
            }

            System.out.println("Masukkan nama atlet cabor voly : ");
            for (int m=1 ; m<=5 ; m++) {
                System.out.print(m+". ");
                voly += sc.nextLine() + ", ";
            }

            System.out.println();
        }

        System.out.println("----- DAFTAR ATLET PORSENI 2024 -----");
        System.out.println("Jumlah politeknik : "+n);
        System.out.println("Cabor Badminton   : "+badminton);
        System.out.println("Cabor Tenis Meja  : "+tenis);
        System.out.println("Cabor Basket      : "+basket);
        System.out.println("Cabor Voly        : "+voly);        
    }
}