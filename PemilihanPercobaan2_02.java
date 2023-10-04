import java.util.Scanner;

public class PemilihanPercobaan2_02{
    public static void main (String args[]){

        Scanner input02 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input02.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input02.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input02.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input02.nextFloat();
        
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 02F);

        String massage = total < 69 ? "Remidi" : "Tidak Remidi" ;

        String kualifikasi, nilai_huruf;
        float nilai_setara;

        if (total >= 80) {
            System.out.println("\nNilai Huruf\t: A\tNilai Setara\t: 4\nKualifikasi\t: Sangat Baik");
        }else if (total >= 73 && total <= 80) {
            System.out.println("\nNilai Huruf\t: B+\nNilai Setara\t: 3,5\nKualifikasi\t: Lebih dari Baik");
        }else if (total >= 65 && total <= 73 ) {
            System.out.println("\nNilai Huruf\t: B\nNilai Setara\t: 3\nKualifikasi\t: Baik");
        }else if (total >= 60 && total <= 65 ) {
            System.out.println("\nNilai Huruf\t: C+\nNilai Setara\t: 2,5\nKualifikasi\t: Lebih dari Cukup");
        }else if (total >= 50 && total <= 60 ) {
            System.out.println("\nNilai Huruf\t: C\nNilai Setara\t: 2\nKualifikasi\t: Cukup");
        }else if (total >= 39 && total <= 50 ) {
            System.out.println("\nNilai Huruf\t: D\nNilai Setara\t: 1\nKualifikasi\t: Kurang");
        }else if (total <= 39) {
            System.out.println("\nNilai Huruf\t: E\nNilai Setara\t: 0\nKualifikasi\t: Gagal");
        }
        
        System.out.println("\nNilai Akhir = " + total + " sehingga " + massage);

        
    }   
}