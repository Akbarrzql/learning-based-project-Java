package TugasMatematika2;
import java.util.Scanner;

public class BangunDatar {
    //Soal NO 1
    public static void Persegi(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Menghitung Persegi ---");
        System.out.println("Luas (1) / Keliling (0)");
        System.out.println("Pilih Menu : ");
        int choice = input.nextInt();
        if (choice == 1){
            double s, luas;
            System.out.println("\n-->Persegi<--");
            System.out.print("Masukkan Panjang sisi : ");
            s = input.nextFloat();
            System.out.println("=>");
            luas = s * s;
            System.out.println("Luas  = " + (float)luas + "cm²");
            System.out.println("Selesai");
        }else if (choice == 0){
            double s,keliling;
            System.out.println("\n-->Persegi<--");
            System.out.print("Masukkan Panjang sisi : ");
            s = input.nextFloat();
            System.out.println("=>");
            keliling = 4* s;
            System.out.print(" \nKeliling = "+ (int)keliling + "cm");
            System.out.println("");
        }
    }
    //Soal No 2
    public static void PersegiPanjang(){

        Scanner input = new Scanner(System.in);
        System.out.println("\nKeterangan Kode\n");
        System.out.println("1 = Menghitung Luas");
        System.out.println("2 = Menghitung Keliling\n");
        System.out.println("===================");
        System.out.print("\nMasukan Kode Pemilihan : ");
        int choice = input.nextInt();

        if (choice == 1){
            float panjang, lebar, luas;

            System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG : ");
            System.out.println("-----------------------------------------------");

            System.out.print("Masukan Panjang      : ");
            panjang=input.nextFloat();
            System.out.print("Masukan Lebar        : ");
            lebar=input.nextFloat();

            luas=panjang*lebar;

            System.out.println("Luas Persegi Panjang : "+luas + "cm²");
        }else if (choice == 2){
            float panjang, lebar, luas, keliling;

            System.out.println("PROGRAM JAVA MENGHITUNG KELILING PERSEGI PANJANG : ");
            System.out.println("-----------------------------------------------");

            System.out.print("Masukan Panjang      : ");
            panjang=input.nextFloat();
            System.out.print("Masukan Lebar        : ");
            lebar=input.nextFloat();

            keliling = (panjang * 2) + (lebar * 2);

            System.out.println("Luas Persegi Panjang : "+ keliling + "cm");
        }

    }
    //Soal NO 3
    public static void segitiga(){
        Scanner inp = new Scanner(System.in);
        char ulang;
        int pilihan, pilihan2;

                System.out.println("1. Luas permukaan");
                System.out.println("2. Keliling");
                System.out.println("Masukkan angka : ");
                pilihan2 = inp.nextInt();
                switch (pilihan2) {
                    case 1 -> {
                        double alas, tinggi, luas;
                        System.out.println("Masukan Alas Segitiga");
                        alas = inp.nextFloat();
                        System.out.println("Masukan Tinggi Segitiga");
                        tinggi = inp.nextFloat();
                        luas = (alas * tinggi) / 2;
                        System.out.println("Luas Segitiga : " + luas + "cm²");
                    }
                    case 2 -> {
                        double a, b, c, keliling;
                        System.out.print("Masukkan Sisi a :");
                        a = inp.nextFloat();
                        System.out.print("Masukkan Sisi b :");
                        b = inp.nextFloat();
                        System.out.print("Masukkan Sisi c :");
                        c = inp.nextFloat();
                        keliling = a + b + c;
                        System.out.println("Keliling Segitiga = " + keliling + "cm");
                    }
                }


    }
    //Soal No 4
    public static void Trapesium(){
        float sisiA = 0, sisiB = 0, tinggi = 0, result;
        float SisiSamping = 0;
        float isLanjut = 0;


//        Scanner
        Scanner input = new Scanner(System.in);


            System.out.println("--- Trapesium ---");
            System.out.print("Luas (1) / Keliling (0)");
            int choice = input.nextInt();

            if (choice == 1){
                System.out.print("Masukkan sisi A : ");
                sisiA = input.nextFloat();
                System.out.print("Masukkan sisi B : ");
                sisiB = input.nextFloat();
                System.out.print("Masukkan Tinggi : ");
                tinggi = input.nextFloat();

                result = ((sisiA + sisiB) * tinggi) / 2;
                System.out.println("Luas Trapesium dari " + " Sisi A : " + sisiA + ", Sisi B : " + sisiB + ", dan Tinggi : " + tinggi + " = " + result + "cm²");

            } else if (choice == 0){
                System.out.print("Masukkan sisi Sejajar A : ");
                sisiA = input.nextFloat();
                System.out.print("Masukkan sisi Sejajar B : ");
                sisiB = input.nextFloat();
                System.out.print("Masukkan Sisi Samping : ");
                SisiSamping = input.nextFloat();


                result = sisiA + sisiB + SisiSamping*2;
                System.out.println("Keliling Trapesium dari " + " Sisi Sejajar A : " + sisiA + ", Sisi Sejajar B : " + sisiB + "Sisi Samping : "+ SisiSamping +" = " + result + "cm");
            }
    }
    //Soal No 5
    public static void JajarGenjang(){
        Scanner sc = new Scanner(System.in);

        float a, b, alas, tinggi, keliling, luas;
        int menu;

        System.out.println("========= KELILING & LUAS JAJAR GENJANG =========\n\n");
        System.out.println("1. Keliling Jajar Genjang\n2. Luas Jajar Genjang\n\n");
        System.out.print("Inputkan Nomor Menu            = ");
        menu = sc.nextInt();
        System.out.println("");

        switch (menu) {
            case 1 -> {
                System.out.print("Inputkan Sisi Pertama Jajar Genjang = ");
                a = sc.nextFloat();
                System.out.print("Inputkan Sisi Kedua Jajar Genjang   = ");
                b = sc.nextFloat();
                keliling = 2 * (a + b);
                System.out.println("\nKeliling Jajar Genjang              = " + keliling + "cm");
            }
            case 2 -> {
                System.out.print("Inputkan Alas Jajar Genjang         = ");
                alas = sc.nextFloat();
                System.out.print("Inputkan Tinggi Jajar Genjang       = ");
                tinggi = sc.nextFloat();
                luas = alas * tinggi;
                System.out.println("\nLuas Jajar Genjang                  = " + luas + "cm²");
            }
            default -> System.out.println("Input Salah");
        }
    }
    //Soal No 6
    static float kelilingBelahKetupat(float sisi) {
        return 4 * sisi;
    }

    static double luasBelahketupat(double diagonal1, double diagonal2) {
        return diagonal1 * diagonal2 * 0.5;
    }
    public static void BelahKetupat(){
        Scanner scannerAngka = new Scanner(System.in);
        char luasAtauKeliling;

            System.out.println("Belah ketupat");
            System.out.println("Luas atau keliling L/K");
            luasAtauKeliling = scannerAngka.next().charAt(0);

            if(luasAtauKeliling == 'K' || luasAtauKeliling == 'k'){
                System.out.println("Masukan Panjang sisi");
                float scannerSisi = scannerAngka.nextFloat();
                System.out.println("Hasil dari kelilingnya adalah " + kelilingBelahKetupat(scannerSisi) + "cm");
            }else{
                System.out.println(" Masukan Panjang diagonal 1");
                float scannerdiagonal1 = scannerAngka.nextFloat();
                System.out.println("Masukan Panjang diagonal  2");
                float scannerdiagonal2 = scannerAngka.nextFloat();
                System.out.println("Hasil dari luasnya adalah " + luasBelahketupat(scannerdiagonal1, scannerdiagonal2) + "cm²");
            }
        }
    //Soal No 7
    public static void Lingkaran(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Menghitung Lingkaran ---");
        System.out.println("Luas (1) / Keliling (0)");
        System.out.println("Pilih Menu : ");
        int choice = input.nextInt();
        if (choice == 1){
            //Deklarasi variabel
            double luas, phi=3.14;
            double r;

            //Input nilai jari-jari
            System.out.print("Masukan Jari-jari : ");
            r=input.nextDouble();

            //Menghitung luas lingkaran
            luas=phi*r*r;

            //Tampilkan hasil
            System.out.println("Luas Lingkaran = "+luas + "cm²");
        }else if (choice == 0){
            //Deklarasi variabel
            double keliling, phi=3.14;
            int r;

            //Input nilai jari-jari
            System.out.print("Masukan Jari-jari : ");
            r=input.nextInt();

            //Menghitung keliling lingkaran
            keliling=2*phi*r;

            //Tampilkan hasil
            System.out.println("Keliling Lingkaran = "+keliling + "cm");
        }
    }
    //Soal No 8
    public static void LayangLayang(){
        System.out.println("\nKeterangan Kode\n");
        System.out.println("1 = Menghitung Luas");
        System.out.println("2 = Menghitung Keliling\n");
        System.out.println("===================");
        System.out.print("\nMasukan Kode Pemilihan : ");
        Scanner input = new Scanner(System.in);

            int pilihan2 = input.nextInt();
            if (pilihan2 == 1) {
                System.out.println("\n###Menghitung Luas Layang-layang###");

                System.out.print("\nMasukan Diagonal 1 : ");
                double d1 = input.nextFloat();
                System.out.print("Masukan Diagonal 2 : ");
                double d2 = input.nextFloat();
                double luas = 0.5 * d1 * d2;

                System.out.println("\n===========================================");
                System.out.println("Luas Layang Layang Adalah : " + luas + "cm²");
                System.out.println("===========================================");
            } else {
                System.out.println("\n###Menghitung Keliling Layang-layang###\n");

                System.out.print("Masukan Sisi A : ");
                double A = input.nextFloat();
                System.out.print("Masukan sisi B : ");
                double B = input.nextFloat();
                double keliling = A + B;
                double hasil = keliling * 2;

                System.out.println("\n===========================================");
                System.out.print("Keliling layang-layang adalah : " + hasil + "cm");
                System.out.println("\n===========================================");
            }
    }

    public static void main(String[] args) {
        String Mengulang = "Y";
        while (Mengulang.equals("Y")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Program Keliling Dan Luas Bangun Datar");
            System.out.println("Pilih Bangun Datar Yang Ingin Di Eksekusi");
            System.out.println("""
                1. Persegi
                2. Persegi Panjang
                3. Segitiga
                4. Trapesium
                5. Jajar Genjang
                6. Belah Ketupat
                7. Lingkaran
                8. Layang-Layang
                """);
            System.out.print("Masukan Pilihan : ");
            int Pilihan = input.nextInt();
            switch (Pilihan) {
                case 1:
                    Persegi();
                    break;
                case 2:
                    PersegiPanjang();
                    break;
                case 3:
                    segitiga();
                    break;
                case 4:
                    Trapesium();
                    break;
                case 5:
                    JajarGenjang();
                    break;
                case 6:
                    BelahKetupat();
                    break;
                case  7:
                    Lingkaran();
                    break;
                case 8:
                    LayangLayang();
                    break;
                default:
                    System.out.println("Menu Yang Dipilih Tidak Ada Pilihan");
                    break;
            }
            System.out.println("Ingin Mengulang? (Y/N)");
            Scanner user = new Scanner(System.in);
            Mengulang = user.nextLine().toUpperCase();
        }
        System.out.println("Program Bangun Datar Selesai");
    }
}
