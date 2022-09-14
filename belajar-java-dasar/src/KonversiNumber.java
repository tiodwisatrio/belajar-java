public class KonversiNumber {
    public static void main(String[] args) {
        //Widening Casting (auto) : byte -> short -> int -> long -> float -> double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        //Narrowing Casting (manual) : double -> float -> long -> int -> char -> short -> byte
        double iniDouble = 12.10;
        int iniInt2 = (int) iniDouble;

    }
}
