public class Siswa1 {

    int nis;
    String nama_siswa;

    public Siswa1(int i, String a) {
        nis=i;
        nama_siswa=a;
    }

    public int getNis(){

        return nis;
    }

    public String getNama(){

        return nama_siswa;
    }
}

/**
* pendeklarasian object pada baris 4 harus menggunakan parameter
* karena method constructor pada class Siswa1 memiliki parameter
 */