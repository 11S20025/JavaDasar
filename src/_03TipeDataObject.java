public class _03TipeDataObject {
    public static void main(String[] args) {
        //Type data object
        //Type data primitif bisa langsung dipanggil didalam type data object
        byte iniByte = 100;
        Byte iniByteObject = iniByte;
        System.out.println(iniByteObject);

        int age = 30;
        Integer ageObject = age;
        int ageAgain = ageObject;

        //Jika dari Object ke primitf harus menggunakan .shortValue(), .byteValues() jika berbada type
        //Jika type sama hanya beda primitif dan Object, mis. Integer dan int, maka bisa langsung dipanggil
        //Jika sesama primitif, bisa langsung (type) variabel, contoh : (short) age;

        short shortAge = ageObject.shortValue();
        System.out.println(shortAge);
    }
}
