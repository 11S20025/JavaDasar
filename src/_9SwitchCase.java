public class _9SwitchCase {

    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName ="Invalid Day Name";
                break;
        }
        System.out.println("Day " + day + " is " + dayName);

        var nilai = "A";
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Anda lulus dengan predikat baik!";
            case "B", "C" -> ucapan = "Anda lulus.";
            case "D" -> ucapan = "Anda belum lulus.";
            default -> ucapan = "Mungkin anda salah jurusan";
        }
        System.out.println("Nilai anda " + nilai + ", " + ucapan);
    }
}
