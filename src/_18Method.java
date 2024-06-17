public class _18Method {
    public static void main(String[] args) {
        sayHello();
        sayHi("Anton", "Siborongborong");
    }
    static void sayHello(){
        System.out.println("Hello World!");
    }

    static void sayHi(String name, String address){
        System.out.println("Hello " + name + ", I come from " + address);
    }
}
