public class switch1 {
    public static void main(String args[]) {
        int x = 8;
        // switch (x) {
        //     case 8:
        //         System.out.println("x is 8");
        //         break;
        //     case 9:
        //         System.out.println("x is 9");
        //         break;
        //     default:
        //         System.out.println("x is neither 8 nor 9");

        // }
        
        // new switch statement
        switch (x) {
            case 8 -> System.out.println("x is 8");
            case 9 -> System.out.println("x is 9");
            default -> System.out.println("x is neither 8 nor 9");
        }
    }

}



