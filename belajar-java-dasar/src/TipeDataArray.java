import java.lang.reflect.Array;
import java.util.Arrays;

public class TipeDataArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] harga = {1000, 2000, 3000};

        // print seluruh isi array
        System.out.println("Mencetak seluruh isi array cars : " + Arrays.toString(cars));
        System.out.println("Mencetak seluruh isi array harga : " + Arrays.toString(harga));

        //print satu isi array saja
        System.out.println("isi dari array cars index pertama : " + cars[0]);
        System.out.println("isi dari array harga index pertama : " + harga[0]);

        //print panjang array
        System.out.println("Panjang dari array cars : " + cars.length);
        System.out.println("Panjang dari array harga : " + harga.length);

        //mengubah data pada array
        cars[3] = "Avanza";
        System.out.println("Mobil dengan index ketiga : " + cars[3]);

        // array 2 dimensi
        String[][] klubBola = {
                {"Real Madrid"},
                {"Man United"},
                {"Liverpool"},
        };
        System.out.println("Klub Bola : " + Arrays.deepToString(klubBola));
        System.out.println("Mengambil data Real Madrid : " + klubBola[0][0]);
        System.out.println("Mengambil data Man utd : " + klubBola[1][0]);
        System.out.println("Mengambil data Liverpool : " + klubBola[2][0]);

    }
}
