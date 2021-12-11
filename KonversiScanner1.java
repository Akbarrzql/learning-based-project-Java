import java.util.Scanner;
public class KonversiScanner1 {
    // Global Variable
    static String name;
    static String jenis_kelamin;
    static String jk;
    static int bilDes;

    public static void Biner(int n)
    {
        if(n>1)
        {
            Biner(n/2);
        }
        System.out.print(n%2);
    }
    public static void Oktal(int n)
    {
        char[] daftarOktal={'0','1','2','3','4','5','6','7'};
        int sisaBagi = n % 8;
        if(n>0)
        {
            Oktal((n - sisaBagi)/8);
            System.out.print(daftarOktal[n%8]);
        }
    }
    public static void Hexa(int n)
    {
        char[] daftarHexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int sisaBagi = n % 16;
        if(n>0)
        {
            Hexa((n - sisaBagi)/16);
            System.out.print(daftarHexa[n%16]);
        }
    }
    public static void inputDes()
    {
        System.out.print("Masukkan Bilangan Desimal = ");
        Scanner inputan = new Scanner(System.in);
        bilDes = inputan.nextInt();
// return bilDes;
    }
    public static void tampilBiner()
    {
        inputDes();
        System.out.print("Binernya Adalah ");
        Biner(bilDes);
    }
    public static void tampilHexa()
    {
        inputDes();
        System.out.print("Hexanya Adalah ");
        Hexa(bilDes);
    }
    public static void tampilOktal()
    {
        inputDes();
        System.out.print("Oktalnya Adalah ");
        Oktal(bilDes);
    }
    public static int inpBil()
    {
        System.out.println("=================================="
                + "\nSelamat Datang " + jk + ", " + name + ",");
        System.out.println("Silahkan Memilih Menu Konversi "
                + "Bilangan ke: " +
                "\n1. Biner \n2. Hexa \n3. Oktal \n4. Exit");
        System.out.print("Masukkan Angka Menu = ");
        Scanner inputan = new Scanner(System.in);
        int pilMenu = inputan.nextInt();
        return pilMenu;
    }
    public static void menU(int pil)
    {
        System.out.println("\033");
        switch(pil)
        {
            case 1: tampilBiner(); break;
            case 2: tampilHexa(); break;
            case 3: tampilOktal(); break;
            case 4: System.out.println("Kamsia ya, sudah mampir.");
                System.exit(0); break;
            default : System.out.println("(Maaf. Pilih Angka 1 - 4 Saja)"); break;
        }
        System.out.println("\033");
    }
    public static void input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda :");
        name = input.nextLine();
        if(name.equals(""))
        {
            nama_kosong();
            input();
        }
        else
        {
            jenis_kelamin();
        }
    }
    public static void nama_kosong()
    {
        Scanner nama_kosong = new Scanner(System.in);
        System.out.println("Maaf, Nama Harus Diisi !!!");
    }
    public static void jenis_kelamin()
    {
        Scanner jenis = new Scanner(System.in);
        System.out.println("Masukkan Jenis Kelamin = ");
        System.out.println("Pilih : \n 1 Laki-Laki \n 2 Perempuan");
        int response = jenis.nextInt();

        switch(response)
        {
            case 1 :
                jk = "Bro";
                break;
            case 2 :
                jk = "Sis";
                break;
            default :
                Scanner waria = new Scanner(System.in);
                System.out.println("Wah, Maaf Anda Harus Memilih 1 atau 2 :D");
                jenis_kelamin();
                break;
        }
    }
    public static void main(String aKU[])
    {
        input();
        do
        {
            menU(inpBil());
        }
        while(true);
    }
}