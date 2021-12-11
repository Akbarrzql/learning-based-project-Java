import java.util.Scanner;
public class ArrayAndScanner {
    public static void main(String[] args) {
        Scanner Hobi = new Scanner(System.in);
        int JumlahHobi;

        System.out.print("Masukan Jumlah Hobi Anda = ");
        JumlahHobi = Hobi.nextInt();

        String[] NamaHobi = new String[JumlahHobi];

        for (int i = 0; i < JumlahHobi; i++) {
            System.out.print("Hobi Anda Yang "+(i+1)+" = ");
            NamaHobi[i] = Hobi.next();
        }

        for (String Hasil:NamaHobi){
            System.out.println("Nama Hobi Yang Anda Masukan = "+ Hasil);
        }
    }
}
