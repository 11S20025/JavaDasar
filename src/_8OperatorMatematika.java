public class _8OperatorMatematika {
    public static void main(String[] args) {

        //Operator Bitwise
        // & -> keduanya bernilai 1 maka nilainya 1, jika tidak nilainya 0
        // | -> menghasilkan 1 jika salah satu bit bernilai 1
        // ^ -> menghasilkan 1 jika kedua bit berbeda
        // ~ -> komplemen (inverse)
        // >> -> menggeser bit kekanan, menambahkan bit 0 di posisi bit baru
        // << -> menggeser bit kekiri, menambahkan bit 0 di posisi bit baru

        int a = 0x000A; // 0000 0000 0000 1010
        int b = 0x0022; // 0000 0000 0010 0010
        System.out.println(a & b); //2
        System.out.println(a | b); //42
        System.out.println(a ^ b); //40
    }
}
