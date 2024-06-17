public class _6ArrayMultidimensional {

    public static void main(String[] args) {

        String[][] arrayName = new String[3][3];

        arrayName[0][0] = "Anton";
        arrayName[0][1] = "Roycar";
        arrayName[0][2] = "Nababan";

        arrayName[1][0] = "Daniel";
        arrayName[1][1] = "Andres";
        arrayName[1][2] = "Simangunsong";

        arrayName[2][0] = "Marcel";
        arrayName[2][1] = "Joshua";
        arrayName[2][2] = "Simanjuntak";

        String names = arrayName[0][2];
        System.out.println(names);

        System.out.println(arrayName.length);

        String [][] member = {
                {"Anton", "Roycar", "Nababan"},
                {"Budi", "Jono"},
                {"Eko", "Rahmat"}
        };

        String [] member1 = member[0];
        System.out.println(member1[0]);

        System.out.println(member[1][0]);
        System.out.println(member[2][1]);
    }
}
