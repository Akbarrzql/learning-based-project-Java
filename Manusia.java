// Manusia Ini Adalah Class
public class Manusia {
    //Field Atau Deklarasi Field
    String Nama;
    String Alamat;
    Integer Telfon;
    final String Negara = "Indonesia";

    public static void main(String[] args) {

         //Membuat Object
        var Manusia1 = new Manusia();
        Manusia1.Nama = "Akbar Rizqullah";
        Manusia1.Alamat= "Jl.Sonokeling";
        Manusia1.Telfon = 333;

        Manusia Manusia2 = new Manusia();
        Manusia2.Nama = "Sejati Adli";
        Manusia2.Alamat = "Jl. Papringan";
        Manusia2.Telfon = 444;

        Manusia Manusia3;
        Manusia3 = new Manusia();
        Manusia3.Nama = "Amri Iqro";
        Manusia3.Alamat="Nusa Tengara Barat";
        Manusia3.Telfon= 555;

        //print
        System.out.println(Manusia1.Nama);
        System.out.println(Manusia1.Alamat);
        System.out.println(Manusia1.Telfon);
        System.out.println(Manusia1.Negara);
        System.out.println("Manusia 1 Selesai");

        System.out.println(Manusia2.Nama);
        System.out.println(Manusia2.Alamat);
        System.out.println(Manusia2.Telfon);
        System.out.println(Manusia2.Negara);
        System.out.println("Manusia 2 Selesai");

        System.out.println(Manusia3.Nama);
        System.out.println(Manusia3.Alamat);
        System.out.println(Manusia3.Telfon);
        System.out.println(Manusia3.Negara);
        System.out.println("Manusia 3 Selesai");

    }
}
