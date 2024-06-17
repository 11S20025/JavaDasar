public class _20MethodArgument {
    public static void main(String[] args) {
        sayCongrats("Anton", 80,90,100,70,85,60);
    }
    static void sayCongrats(String name, int...values){
        int total = 0;

        for(var value : values){
            total += value;
        }
        int finalValue = total/ values.length;
        if (finalValue > 75){
            System.out.println("Selamat " + name + ", kamu lolos!");
        }else{
            System.out.println("Maaf " + name + ", kamu belum lolos!");
        }
    }

}
