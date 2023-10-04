import java.util.Scanner;

public class PemilihanPercobaan1_02{
    public static void main (String args[]){

        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan angka:   ");
        int angka = input02.nextInt();

        String hasil = (angka % 2 == 0) ? "Angka " + angka + " bilangan genap" : "Angka " +angka+ " bilangan ganjil" ;
        System.out.println(hasil);

    }
}