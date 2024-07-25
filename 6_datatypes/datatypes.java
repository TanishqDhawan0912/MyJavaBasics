// Datatypes in Java
    // Integer int a=1;
    // Float float a=1.0f;
    // Character char a='a';
    // Boolean boolean a=true;

// Intergers
// byte -> 1byte (-2^7 to 2^7-1) ||  byte a=127;
    // short -> 2byte || short a=32767;
    // int -> 4byte || int a=2147483647;
    // long -> 8byte || long a=9223372036854775807l;

//     class variable {
//         public static void main(String a[]) {
//             byte b = 127;
//             short s = 32767;
//             int i = 2147483647;
//             long l = 9223372036854775807l;
//             float f = 1.0f;
//             double d = 1.0;
//             char c = 'a';
//             boolean bl = true;
//             System.out.println(b);
//             System.out.println(s);
//             System.out.println(i);
//             System.out.println(l);
//             System.out.println(f);
//             System.out.println(d);
//             System.out.println(c);
//             System.out.println(bl);
//     }
// }


import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}