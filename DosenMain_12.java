import java. util. Scanner;
class DosenMain_12 {
    public static void main(String[] args) {
        Dosen_12 dosen1 = new Dosen_12("123456", "Dr. Heri Santoso", 2010, "S2", "Teknik Informatika");
        Dosen_12 dosen2 = new Dosen_12("654321", "Dr. Diah Aminah", 2015, "S3", "Sistem Informasi");

        dosen1.tampilkanInfo();
        dosen2.tampilkanInfo();

        dosen1.ubahProdi("Ilmu Komputer");
        dosen2.ubahPendidikan("Profesor");

        dosen1.tampilkanInfo();
        dosen2.tampilkanInfo();
    }
}