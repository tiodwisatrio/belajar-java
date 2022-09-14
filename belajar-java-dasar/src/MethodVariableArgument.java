//Method Variable Argument mirip dengan Rest Parameter di JavaScript
public class MethodVariableArgument {
    public static void main(String[] args) {
        hasilKelulusan("Tio", 80,60,40,20);
    }

    static void hasilKelulusan(String nama, int... kumpulanNilai) {
        var total = 0;
        for (var nilai : kumpulanNilai) {
            total += nilai;
        }
        int nilaiAkhir = total / kumpulanNilai.length;

        //validasi kondisi
        if(nilaiAkhir >= 75) {
            System.out.println("Selamat " + nama + " Anda Lulus");
        } else{
            System.out.println("Maaf " + nama + " Anda Tidak Lulus");
        }

    }
}
