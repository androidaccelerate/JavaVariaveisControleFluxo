public class Casting {
    public static void main(String[] args) {
        double d = 3.1415d;
        System.out.println("Double d: " + d);
        int i = (int) d;
        System.out.println("Int i: " + i);

        int i2 = (int) 3.1415;

        double d2 = 5;
        System.out.println("Double d2: " + d2);
        int i3 = (int) d2;
        System.out.println("Int i3: " + i3);

        int d4 = 10;
        double d3 = d4;

        long l = 1000000000l;
        System.out.println("Long l: " + l);
        int i4 = (int) l;
        System.out.println("Int i4: " + i4);

        float f = 3.1415f;
    }
}
