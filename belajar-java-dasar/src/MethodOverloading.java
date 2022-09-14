//Bisa membuat method dengan nama yg sama, tetapi jumlah parameter dan tipe data nya harus berbeda-beda!!!
public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Tio");
        sayHello("Budi", 20);
    }

    static void sayHello() {
        System.out.println("Hello World");
    }

    static void sayHello(String nama) {
        System.out.println("Hello World from " + nama);
    }

    static void  sayHello(String nama, int umur) {
        System.out.println("Hello World from " + nama + " Saya berusia " + umur + " Tahun");
    }
}
