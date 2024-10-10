package jobsheet7;

import java.util.Scanner;

public class siakadfor3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100, minimal = 60;
        int jmlLulus = 0, jmlTdklulus = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = s.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai < minimal){
                jmlTdklulus++;
            }else{
                jmlLulus++;
            }
            
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus : " + jmlLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus : " + jmlTdklulus);
    }
}