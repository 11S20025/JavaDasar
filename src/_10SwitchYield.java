public class _10SwitchYield {
    public static void main(String[] args) {
        String value = "A";
        String ucapan = switch (value){
            case "A":
                yield "Wow, Anda lulus dengan baik!";
            case "B", "C":
                yield "Anda lulus!";
            case "D":
                yield "Anda tidak lulus!";
            default:
                yield "Anda salah jurusan!";
        };
        System.out.println(ucapan);
    }
}
