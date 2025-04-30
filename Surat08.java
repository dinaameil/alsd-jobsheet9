public class Surat {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat() {}

    public Surat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilSurat() {
        System.out.println("ID: " + idSurat + ", Nama: " + namaMahasiswa + ", Kelas: " + kelas + 
                           ", Jenis Izin: " + jenisIzin + ", Durasi: " + durasi + " hari");
    }
}
