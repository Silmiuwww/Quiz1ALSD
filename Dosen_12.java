import java. util. Scanner;
class Dosen_12 {
    private String nidn;
    private String nama;
    private int tahunMasuk;
    private String jenjangPendidikan;
    private String prodi;

    public Dosen_12(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    public void tampilkanInfo() {
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Jenjang Pendidikan: " + jenjangPendidikan);
        System.out.println("Program Studi: " + prodi);
        System.out.println("-----------------------------");
    }

    public void ubahProdi(String prodiBaru) {
        this.prodi = prodiBaru;
        System.out.println("Program Studi dosen " + nama + " diubah menjadi: " + prodi);
    }

    public void ubahPendidikan(String jenjangBaru) {
        this.jenjangPendidikan = jenjangBaru;
        System.out.println("Jenjang Pendidikan dosen " + nama + " diubah menjadi: " + jenjangPendidikan);
    }

    public String getNama() {
        return nama;
    }
}
