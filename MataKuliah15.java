public class MataKuliah15 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah15(){
    }
    public MataKuliah15(String kodeMK, String nm, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tampilInformasi(){
        System.out.println("Kode Matakuliah: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam:" + jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }
    void tambahJam(int jam){
        jumlahJam += jam;
    }
    void kurangiJam(int jam){
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak  mencukupi ");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumllah jam berhasil dikurangi. Sisa jam : " + jumlahJam);
        }
    }
}



 