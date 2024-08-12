public class logicaloperator {

    public static void main(String[] args) {
        int a = 6;
        int y = 5;
        // boolean result = a > y && a < y; // false
        // boolean result = a > y || a < y; // true
        boolean result = !(a > y); // false
        System.out.println(result); // true
    }
}