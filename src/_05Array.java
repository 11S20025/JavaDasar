public class _5Array {
    public static void main(String[] args) {

        String [] arrayName = new String[3];
        int[] arrayScore = new int[10];

        arrayName[0] = "Anton";
        arrayName[1] = "Roycar";
        arrayName[2] = "Nababan";

        System.out.println(arrayName[0]);
        System.out.println(arrayName);

        String firstName = arrayName[0];
        System.out.println(firstName);

        System.out.println(arrayName.length);
        System.out.println(arrayScore.length);
    }
}
