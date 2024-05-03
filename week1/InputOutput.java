package week1;
// import java.util.Scanner;
// /*Or
//  * import java.Util.*;
//  */


// public class InputOutput {
//     public static void main(String[] args) {
//         /*User output */
//         System.out.println("This sentence will have line break ");
//         /*system out print */
//         System.out.print("This will not have break");
//         System.out.print(" This line will continue.\n");
//         /*String formatting using System.out.printf 
//          * %s String, %d Integral,%f floading point, %b boolean
//          * This will also not break line
//          */

//          System.out.printf("Hello %s, Good morning","world");
//          System.out.printf("The number is %d ",10);
//          /* can use multiple formatter */
//          System.out.printf("\nThe floating %f and boolean %b",10.3f, false);

//          /* User Input
//           * import java.util.scanner; \\ copy this at the top of the code
//           */
//           Scanner scan = new Scanner(System.in);
//           System.out.println("The following take whole sentence");
//           String wholeOutput = scan.nextLine();
//           System.out.println("The input taken is "+ wholeOutput);
//           System.out.println("The followig takes integer");
//           int intInput = scan.nextInt();
//           System.out.println("The input taken is "+ intInput);
//           System.out.println("The following takes double");
//           double doubleInput = scan.nextDouble();
//           System.out.println("The input taken is "+ doubleInput);
//           System.out.println("The following takes is "+ doubleInput);
//           System.out.println("The following takes boolean");
//           boolean booleanInput = scan.nextBoolean();
//           System.out.println("The input take is "+ booleanInput);
//           scan.close();/*you might close scan when all input is done */
//     }
    
// }

import java.util.Scanner;
/*Or
 * import java.Util.*;
 */


public class InputOutput {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        
        System.out.println("What is your name: ");
        String name = scan1.nextLine();
        System.out.println(name);
         System.out.println();

        scan1.close();


    }
}    