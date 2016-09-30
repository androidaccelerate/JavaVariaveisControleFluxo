public class ControlandoLoops {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 20 == 0) {
                System.out.println("i:" + i);
                break;
            }
        }

        for (int i = 0; i < 100; i++) {
            if (i >= 50 && i <= 70){
                continue;
            }
            System.out.println("i: " + i);
        }
    }
}
