import java. util. Scanner;
class MataKuliah_12 {
    private String kodeMK;
    private String namaMK;
    private int sks;
    private Dosen_12[] dosenPengampu;
    private int jumlahDosen; 

    public MataKuliah_12(String kodeMK, String namaMK, int sks, int kapasitasDosen) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = new Dosen_12[kapasitasDosen];
        this.jumlahDosen = 0;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Dosen Pengampu:");
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("  - " + dosenPengampu[i].getNama());
        }
        System.out.println("-----------------------------");
    }

    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
        System.out.println("Nama Mata Kuliah diubah menjadi: " + namaMK);
    }

    public void ubahSKS(int sksBaru) {
        if (sksBaru < 2) {
            System.out.println("Perubahan gagal! SKS tidak boleh kurang dari 2.");
        } else {
            this.sks = sksBaru;
            System.out.println("SKS Mata Kuliah diubah menjadi: " + sks);
        }
    }

    public void tambahDosen(Dosen_12 dosen) {
        if (jumlahDosen < dosenPengampu.length) {
            dosenPengampu[jumlahDosen] = dosen;
            jumlahDosen++;
            System.out.println("Dosen " + dosen.getNama() + " ditambahkan sebagai pengampu mata kuliah " + namaMK);
        } else {
            System.out.println("Tidak bisa menambahkan dosen. Kapasitas dosen pengampu penuh!");
        }
    }
}
