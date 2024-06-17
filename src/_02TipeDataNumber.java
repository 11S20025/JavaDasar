public class _02TipeDataNumber {
    public static void main(String[] args) {

        //Tipe Data Primitif
        // byte, short, int, long, float, double, boolean, char

        //byte = 1 byte
        //byte --> -((2*7)) =-128 dan ((2*7)-1) = 127
        byte iniByte = 100;

        //short = 2 byte
        //short --> -((2*15)) dan ((2*15)-1)
        short iniShort = 1000;

        //int = 4 byte
        //int --> -((2*31)) dan ((2*31)-1)
        int iniInt = 100;

        //long = 8 byte
        //long --> -((2*63)) dan ((2*63)-1)
        long iniLong = 100l;

        //float = 4 byte
        //float --> mirip seperti int
        float iniFloat = 10.10f;

        //double = 8 byte
        //double --> mirip dengan long
        double iniDouble = 10.10;

        // khusus untuk long bisa ditambahkan (tidak wajib) huruf L(besar atau kecil) pada akhir angka
        // float harus diakhiri dengan huruf f(besar atau kecil) pada akhir angka

        //====================================Literals=================================
        //Desimal, basis 10 dimulai dari 0 hingga 9.
        int decimalInt = 34;

        //Hexadecimal, basis 16 dimulai dari 0 hingga 9 dan A hingga F (harus diawali dengan 0x didepannya).
        int hexaDecimal = 0xFFFFFF;

        //Binary, basis 2, dimana digitnya adalah 0 dan 1 (harus diawali dengan 0d)
        int binary = 0b000010;

        //====================================Konversi Widening=================================
        // byte -> short -> int -> long -> float -> double
        byte ituByte = 19;
        short ituShort = ituByte;
        int ituInt = ituShort;
        long ituLong = ituInt;

        System.out.println(ituLong);

        //====================================Konversi Narrowing=================================
        //double -> float -> long -> int -> short -> byte
        int inti = 128;
        short inti1 = (short) inti;
        byte inti2 = (byte) inti;

        System.out.println(inti1);
        System.out.println(inti2);
    }
}
