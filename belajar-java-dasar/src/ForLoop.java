public class ForLoop {
    public static void main(String[] args) {
        //perulangan
//       for(initStatement; kondisi; postStatement) {
//           block perulangan
//       }

//        kondisi secara default bernilai true

        //perulangan yg kondisinya kosong (true)
        // for(;;) {
        //   System.out.println("Perulangan");
        // }

        //perulangan dengan kondisi
//        var counter = 1;
//        for(; counter <= 10;) {
//            System.out.println("Perulangan ke : " + counter);
//            counter++;
//        }

        //perulangan dengan init statement
//        for(var hitung = 1; hitung <= 5;){
//            System.out.println("Hitungan ke - " + hitung);
//            hitung++;
//        }

        //perulangan dengan post statement
        for(var hitung = 1; hitung <= 5; hitung++) {
            System.out.println("Hitungan ke - " + hitung);
        }

    }
}
