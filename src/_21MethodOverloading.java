public class _21MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Anton");
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
}
