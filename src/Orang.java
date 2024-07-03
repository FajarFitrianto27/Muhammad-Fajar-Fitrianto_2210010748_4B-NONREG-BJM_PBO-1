// 1. class
public class Orang {
    // 3.Atribut 7.Encapsulation - private)
    private String nama;
    private int umur;
    private String alamat;

    // 4.Konstruktor 
    public Orang(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // 6.Metode accesor
    public String getNama() {
        return nama;
    }

    // 5.Metode mutator 
    public void setNama(String nama) {
        this.nama = nama;
    }

    // 6.Metode accesor
    public int getUmur() {
        return umur;
    }

    // 5.Metode mutator 
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // 6.Metode accesor
    public String getAlamat() {
        return alamat;
    }

    // 7. Metode mutator 
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Metode untuk menampilkan informasi orang
    public void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }
}
