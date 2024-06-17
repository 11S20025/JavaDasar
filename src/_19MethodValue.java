public class _19MethodValue {
    public static void main(String[] args) {

        //Menggantikan "void" dengan type data yang di ingin jika ingin Method menghasilkan nilai
        //Untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci "return"

        int value1 = 10;
        int value2 = 12;
        int value3 = counting(value1, value2);
        System.out.println(value3);


    }

    static int counting( int a, int b){
        var total = a + b;
        return total;
    }
}
