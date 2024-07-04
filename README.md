# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.


## Deskripsi
Proyek ini merupakan aplikasi sederhana untuk mengelola data mahasiswa di sebuah universitas. Terdapat tiga kelas utama yaitu `Orang`, `Mahasiswa`, dan `Universitas`.

- `Orang`: Kelas dasar yang merepresentasikan seseorang dengan atribut nama dan umur.
- `Mahasiswa`: Kelas turunan dari `Orang` yang menambahkan atribut NIM dan jurusan.
- `Universitas`: Kelas yang menyimpan daftar mahasiswa dan menyediakan metode untuk menambahkan dan menampilkan informasi mahasiswa.

  
Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Orang`, `Mahasiswa`, dan `Universitas` adalah contoh dari class.

```bash
public class Orang {
    ...
}

public class Mahasiswa extends Orang {
    ...
}

public class Universitas {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Mahasiswa mahasiswa = new Mahasiswa(nama, umur, alamat, nim, jurusan);` adalah contoh pembuatan object.

```bash
 Mahasiswa mahasiswa = new Mahasiswa(nama, umur, alamat, nim, jurusan);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` , `umur` , `alamat` , `nim` , dan `jurusan` adalah contoh atribut.

```bash
private String nama;
private int umur;
private String alamat;
private String nim;
private String jurusan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Orang` dan `Mahasiswa`.

```bash
public Orang(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
}

public Mahasiswa(String nama, int umur, String alamat, String nim, String jurusan) {
        super(nama, umur, alamat);
        this.nim = nim;
        this.jurusan = jurusan;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNim` adalah contoh method mutator.

```bash
 public void setNama(String nama) {
        this.nama = nama;
}

public void setNim(String nim) {
        this.nim = nim;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNim`, `getUmur`, `getAlamat`, dan `getJurusan`,  adalah contoh method accessor.

```bash
public int getUmur() {
        return umur;
}

public String getJurusan() {
        return jurusan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`,  `umur` ,dan `alamat` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int umur;
private String alamat;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Mahasiswa` mewarisi `Orang` dengan sintaks `extends`.

```bash
public class Mahasiswa extends Orang {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. di sini saya menggunakan `public void tampilkan` ke `nim` dan `jurusan`

```bash
@override
public void tampilkan() {
super.tampilkan();
System.out.println("NIM: " + nim);
System.out.println("Jurusan: " + jurusan);
}



10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` pada class Universitas
```bash
if (mahasiswa.getJurusan().equals("Teknik Informatika")) {
            System.out.println(mahasiswa.getNama() + " adalah mahasiswa Teknik Informatika.");
        } else {
            System.out.println(mahasiswa.getNama() + " bukan mahasiswa Teknik Informatika.");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (Mahasiswa mhs : mahasiswaArray) {
    mhs.tampilkan();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan nama mahasiswa: ");
String nama = scanner.nextLine(); 

System.out.print("Masukkan umur mahasiswa: ");
nt umur = scanner.nextInt(); 
scanner.nextLine();  

System.out.print("Masukkan alamat mahasiswa: ");
String alamat = scanner.nextLine(); 

System.out.print("Masukkan NIM mahasiswa: ");
String nim = scanner.nextLine(); // 

System.out.print("Masukkan jurusan mahasiswa: ");
String jurusan = scanner.nextLine(); 
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Mahasiswa[] mahasiswa = new Mahasiswa[2];` adalah contoh penggunaan array.

```bash
 Mahasiswa[] mahasiswaArray = new Mahasiswa[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
 System.out.print("Masukkan indeks mahasiswa untuk ditampilkan: ");
 int indeks = scanner.nextInt();
 mahasiswaArray[indeks].tampilkan();
} catch (ArrayIndexOutOfBoundsException e) {
            
 System.out.println("Indeks tidak valid. Silakan coba lagi.");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Fajar Fitrianto
NPM: 2210010748
