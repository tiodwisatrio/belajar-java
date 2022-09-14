public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer age = 20;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        System.out.println(age);
        System.out.println(iniLong);
        System.out.println(iniBoolean);

        //Konversi dari tipe data primitif
        int semester = 3;
        Integer semesterObject = semester;

        short iniObject = semesterObject.shortValue();

        System.out.println(semesterObject);
        System.out.println(iniObject);



    }
}
