public class Variable {
    public static void main(String[] args) {
        String name = "Tio Dwi Satrio";
        int age = 20;
        boolean pilihan = true;
        String address = "Yogyakarta";

        // java modern => kata kunci var
        var saudara = "Rio Tubagus";

        // final => variable yg nilainya tidak dapat diubah seperti const jika di javascript
        final var idola = "Cristiano Ronaldo";

        System.out.println(name);
        System.out.println(age);
        System.out.println(pilihan);
        System.out.println(address);
        System.out.println(saudara);
        System.out.println(idola);
    }
}
