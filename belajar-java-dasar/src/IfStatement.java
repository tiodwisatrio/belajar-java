public class IfStatement {
    public static void main(String[] args) {
        var nilai = 50;
        var absen = 50;

        if(nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 75 && absen >= 75) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda C");
        } else{
            System.out.println("Anda Harus Mengulang Matkul Ini");
        }
    }
}
