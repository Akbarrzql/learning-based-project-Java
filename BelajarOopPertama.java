package Pertemuan1;
import java.util.Scanner;


class BelajarOopPertama {
    public static void main(String[] args) {
        NamaTeman1("Bimo",16, "Kota Kudus");
        System.out.println("Hasil penjumlahan " + penjumlaham(10, 20));
        Genap();
        Ganjil();
        Umur();
    }

    public static void NamaTeman1(String Nama, Integer Umur, String Almat){
        System.out.println("Nama Teman Saya Adalah "+Nama+" Dia Berumur " + Umur + " Dan Berasal Dari "+Almat);
    }

    public static int penjumlaham (int Angka1, int Angka2){
        int hasil = Angka1 + Angka2;
        return hasil;
    }

    public static void Genap (){
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println("Bilangan Genap "+i);
            }
        }
    }

    public static void Ganjil (){
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1){
                System.out.println("Bilangan Ganjil "+i);
            }
        }
    }

    public static  void Umur(){
        Scanner Umur = new Scanner(System.in);

        System.out.print("Masukan Umur : ");
        int umur = Umur.nextInt();

        if (umur > 17){
            System.out.println("Selamat Anda Bisa Membuat SIM");
        }else {
            System.out.println("Mohon Anda Tidak Bisa Membuat SIM");
        }
    }


}
