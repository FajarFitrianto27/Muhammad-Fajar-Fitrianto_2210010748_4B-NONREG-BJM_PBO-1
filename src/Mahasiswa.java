//1.Class
//8.inheritance 
public class Mahasiswa extends Orang {
    // 3.Atribut 
    private String nim;
    private String jurusan;

    // 4.Konstruktor 
    public Mahasiswa(String nama, int umur, String alamat, String nim, String jurusan) {
        // Memanggil konstruktor kelas induk (Orang)
        super(nama, umur, alamat);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    //6.Metode accesor
    public String getNim() {
        return nim;
    }

    //5. Metode mutator
    public void setNim(String nim) {
        this.nim = nim;
    }

    // 6.Metode accesor
    public String getJurusan() {
        return jurusan;
    }

    // 5.Metode mutator 
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    //9.polimorphism
    @Override
    public void tampilkan() {
        // Memanggil metode tampilkan dari kelas induk (Orang)
        super.tampilkan();
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}
