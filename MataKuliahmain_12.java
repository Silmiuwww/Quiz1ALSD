import java. util. Scanner;
class MataKuliahmain_12 {
    public static void main(String[] args) {
    
        Dosen_12[] daftarDosen = {
            new Dosen_12("123456", "Dr. Heri Santoso", 2010, "S2", "Teknik Informatika"),
            new Dosen_12("654321", "Dr. Diah Aminah", 2015, "S3", "Sistem Informasi"),
            new Dosen_12("345678", "Prof. Soeharto", 2005, "S3", "Ilmu Komputer"),
            new Dosen_12("876543", "Dr. Nina Cahyawati", 2012, "S2", "Sistem Informasi")
        };

        MataKuliah_12 mk1 = new MataKuliah_12("TI101", "Struktur Data", 3, 2);
        MataKuliah_12 mk2 = new MataKuliah_12("SI202", "Manajemen Basis Data", 4, 2);

        mk1.tampilkanInfo();
        mk2.tampilkanInfo();

        mk1.tambahDosen(daftarDosen[0]);  
        mk1.tambahDosen(daftarDosen[2]);  

        mk2.tambahDosen(daftarDosen[1]);  
        mk2.tambahDosen(daftarDosen[3]);  

        mk1.ubahNamaMK("Pemrograman Lanjut");
        mk1.ubahSKS(4);

        mk1.tampilkanInfo();
        mk2.tampilkanInfo();
    }
}
