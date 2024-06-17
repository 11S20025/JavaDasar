public class _7ArrayCopy {
    public static void main(String[] args) {

        String [] arrayName = {"Nama", "Saya", "Adalah", "Anton", "Roycar", "Nababan"};
        String [] target = new String[5];

        //System.arraycopy(sourceArray, sourcePosition, destinationArray, destinationPositition, length);
        System.arraycopy(arrayName, 3, target, 0, 3);
        System.out.println(target[0]);
        System.out.println(target[1]);
        System.out.println(target[2]);
    }
}
