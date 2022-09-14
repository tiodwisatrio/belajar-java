public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println(faktorialTanpaRekursif(5));
        System.out.println(faktorialRekursif(4));
    }

    //faktorial tanpa rekursif
    static int faktorialTanpaRekursif(int value) {
        var result = 1;
        for(int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    //faktorial dengan rekursif
    static int faktorialRekursif(int value){
        if(value == 1) {
            return 1;
        } else{
            return value * faktorialRekursif(value - 1);
        }
    }

}
