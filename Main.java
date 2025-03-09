import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jabatan: ");
        String jabatan = scanner.nextLine();
        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Masukkan Tunjangan: ");
        double tunjangan = scanner.nextDouble();
        System.out.print("Masukkan Potongan: ");
        double potongan = scanner.nextDouble();
        System.out.print("Masukkan Bonus: ");
        double bonus = scanner.nextDouble();

        Pegawai pegawai = new Pegawai(nama, jabatan, gajiPokok, tunjangan, potongan, bonus);

        System.out.println("\nInformasi:");
        pegawai.displayInfo();

        System.out.print("\nMasukkan bonus: ");
        double tambahanBonus = scanner.nextDouble();
        pegawai.tambahBonus(tambahanBonus);

        System.out.println("\nInformasi setelah penambahan bonus:");
        pegawai.displayInfo();

        scanner.close();
    }
}
