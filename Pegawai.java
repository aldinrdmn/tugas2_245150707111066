public class Pegawai {
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double bonus;

    public Pegawai()
    {
        this.nama = "";
        this.jabatan = "";
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.bonus = 0;
        this.potongan = 0;
    }

    public Pegawai(String nama, String jabatan, double gajiPokok, double tunjangan, double potongan, double bonus) 
    {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.bonus = bonus;
    }

    public double hitungGajiTotal() 
    {
        return gajiPokok + tunjangan + bonus - potongan;
    }

    public void tambahBonus(double tambahBonus)
    {
        this.bonus += tambahBonus;
    }

    public void displayInfo()
    {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Potongan: " + potongan);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Gaji: " + hitungGajiTotal());
    }
}