package jobsheet7;

import java.util.Scanner;

public class KafeDoWhile3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;

        do{
            System.out.println("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = s.nextLine();
            if(namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.println("Jumlah Kopi: ");
            kopi = s.nextInt();
            System.out.println("Jumlah Teh : ");
            teh  = s.nextInt();
            System.out.println("Jumlah Roti: ");
            roti = s.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
            s.nextLine();
        }while(true);
    }
}