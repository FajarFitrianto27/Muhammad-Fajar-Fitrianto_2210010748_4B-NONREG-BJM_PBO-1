import java.util.Scanner; // Mengimpor kelas Scanner untuk input dari pengguna

// 1. Class
public class Universitas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // 12. IO Sederhana - Meminta input dari pengguna
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine(); 

        System.out.print("Masukkan umur mahasiswa: ");
        int umur = scanner.nextInt(); 
        scanner.nextLine();  

        System.out.print("Masukkan alamat mahasiswa: ");
        String alamat = scanner.nextLine(); 

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine(); // 

        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = scanner.nextLine(); 

        // 2. Object
        // Membuat objek Mahasiswa dengan data yang diinputkan
        Mahasiswa mahasiswa = new Mahasiswa(nama, umur, alamat, nim, jurusan);
        mahasiswa.tampilkan(); 

        // 10. Seleksi - Memeriksa jurusan mahasiswa
        if (mahasiswa.getJurusan().equals("Teknik Informatika")) {
            System.out.println(mahasiswa.getNama() + " adalah mahasiswa Teknik Informatika.");
        } else {
            System.out.println(mahasiswa.getNama() + " bukan mahasiswa Teknik Informatika.");
        }

        // 13. Array
        // 11. Perulangan dan Array - Membuat array objek Mahasiswa
        Mahasiswa[] mahasiswaArray = new Mahasiswa[2];
        mahasiswaArray[0] = mahasiswa; // 
        mahasiswaArray[1] = new Mahasiswa("Budi", 21, "Jl. Kebon Jeruk", "M002", "Matematika"); 

        // 11. Perulangan untuk menampilkan informasi semua mahasiswa dalam array
        for (Mahasiswa mhs : mahasiswaArray) {
            mhs.tampilkan();
        }

        // 14. Error Handling (Penanganan Kesalahan)
        // Mencoba menampilkan mahasiswa berdasarkan indeks yang diinputkan pengguna
        try {
            System.out.print("Masukkan indeks mahasiswa untuk ditampilkan: ");
            int indeks = scanner.nextInt();
            mahasiswaArray[indeks].tampilkan();
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Indeks tidak valid. Silakan coba lagi.");
        }
    }
}
