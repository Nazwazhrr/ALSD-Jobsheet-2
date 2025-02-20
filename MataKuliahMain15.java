public class MataKuliahMain15 {
        public static void main(String[] args) {
            MataKuliah15 mk1 = new MataKuliah15();
            mk1.kodeMK = "IF101";
            mk1.nama = "Daspro";
            mk1.sks = 2;
            mk1.jumlahJam =4;

            mk1.tampilInformasi();
            mk1.ubahSKS(2);
            mk1.tambahJam(1);
            mk1.kurangiJam(3);

            MataKuliah15 mk2 = new MataKuliah15("IF101", "Daspro", 4, 6);
            mk2.tampilInformasi();
            mk2.ubahSKS(3);
            mk2.tambahJam(2);
            mk2.kurangiJam(2);
    
        }
    }


