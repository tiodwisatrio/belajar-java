public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Anda lulus dengan sangat baik");
                break;
            case "B":
                System.out.println("Anda lulus dengan baik");
                break;
            case "C":
                System.out.println("Anda lulus dengan cukup");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda mungkin salah jurusan");
        }

        //switch lambda
        var nilai2 = "A";
        String ucapan;

        switch (nilai2){
            case "A" -> ucapan = "Hebattt, kamu lulus dengan sangat baik";
            case "B", "C" -> ucapan = "Kamu lulus dengan baik";
            case "D" -> ucapan = "Kamu tidak lulus";
            default -> ucapan = "Mungkin kamu salah jurusan";
        }

        System.out.println(ucapan);


        //switch lambda with yield
        var nilai3 = "A";
        String pengumuman;
        pengumuman = switch (nilai3){
            case "A":
                yield "Wowwwwwww, anda lulus dengan nilai memuaskan!";
            case "B", "C":
                yield "Anda lulus dengan baik";
            case "D" :
                yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah jurusan!";
        };

        System.out.println(pengumuman);

    }
}
