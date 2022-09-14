public class ForEach {
    public static void main(String[] args) {
        // perulangan array biasa tanpa foreach
        System.out.println("Perulangan Biasa");
        String[] names = {
                "Tio", "Dwi", "Satrio",
                "Eko", "Kurniawan", "Khannedy"
        };

        for(var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //perulangan array dengan foreach
        System.out.println("\nPerulangan ForEach");
        String[] cars = {
                "Avanza", "Brio", "Jazz",
                "Lamborghini", "Ferrari", "Alphard"
        };
        for(var car:cars) {
            System.out.println(car);
        }


    }
}
