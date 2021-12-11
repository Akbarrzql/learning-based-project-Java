import java.util.Scanner;

public class LoopAndScanner {
    public static void main(String[] args) {
        Scanner Awal = new Scanner(System.in);

        //Forloop
        System.out.print("Masukan Nilai Awal: ");
        int NilaiAwalForloop = Awal.nextInt();
        System.out.print("Masukan Nilai Akhir: ");
        int NilaiAkhirForloop = Awal.nextInt();

        for (int i = NilaiAwalForloop; i < NilaiAkhirForloop; i++) {
            System.out.println("Hasil Looping = "+i);
        }
        System.out.println("===Selesai Forloop===");

        //While
        System.out.print("Masukan Nilai Awal: ");
        int NilaiAwalWhile = Awal.nextInt();
        System.out.print("Masukan Nilai Akhir: ");
        int NilaiAkhirWhile = Awal.nextInt();

        while (NilaiAwalWhile<NilaiAkhirWhile){
            System.out.println("Hasil While = "+NilaiAwalWhile);
            NilaiAwalWhile++;
        }
        System.out.println("===Selesai While===");

        //DoWhile
        System.out.print("Masukan Nilai Awal: ");
        int NilaiAwalDoWhile = Awal.nextInt();
        System.out.print("Masukan Nilai Akhir: ");
        int NilaiAkhirDoWhile = Awal.nextInt();
        do {
            System.out.println("Do While ke = "+ NilaiAwalDoWhile);
            NilaiAwalDoWhile++;
        }while (NilaiAwalDoWhile < NilaiAkhirDoWhile);
        System.out.println("=== Selesai Dowhile===");

    }
}