public class _23RecursiveStackOverFlow {
    public static void main(String[] args) {
        //Jika menggunakan data yang besar akan mengalami StackOverFlow
        //Jika menggunakan data yang kecil masih aman
        loop(1000000);

    }
    static long loop(long value){
        if(value == 0){
            System.out.println("Selesai");
        }else{
            System.out.println("loop-" +value);
            loop(value-1);
        }
        return value;
    }
}
