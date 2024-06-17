public class _16Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil ke-" +  i);
        }
    }
}
