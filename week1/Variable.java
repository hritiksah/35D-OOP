package week1;

// public class Variable {
//     /*Instance variable 
//     * will need object to access this variable
//     *Not shared between ths object */

//     public static void main(String[] arge) {

//         /*Non primitive data type */
//         /*Declaration */
//         byte byteValue;
//         /*Initialization */
//         byteValue = 100;
//         /*beclaration and Initializtion */
//         short shortValue = 200;
//         /*Multiple declaration */
//         int intValue1,intValue2;
//         intValue1 = 10000;
//         intValue2 = 2000;
//         /*Multiple declation and initialixtion */
//         long longVal1 = -9000, longVal2 = 9000;
//         float floatValue = 90.90f; //the letter 'f' is needed
//         double doubleValue = 100.897d; // the letter 'd' is optional
//         char charValue = 'c'; // must use single quote '
//         boolean booleanValue = false;
//         /*Illegal sction below  */
//         //byte byteValue =100 *// we cannot redeclare the variable
//         //byteValue= 200; // instead use reassignment
//         //boolean bolval2 = 'false';//cannot use different type
//         //bute byteValue2 = 10000000; //cannot exceed min and max
//         /* Non Primitive data type */
//         String stringValue2 = "Ths is a string value";
//         System.out.println(stringValue2);
//         /*Object for this we san use the same public class made */
//         Variable variableObject = new Variable();
//         /*Use object from above to access instance variable */
//         System.out.println(VariableObject.instanceVariable);
//         /*use class to use static varible */
//         System.out.println(Variable.staticVariable);
//         /*type casting */
//         int intValueType =100;
//         double intValueConvertedToDouble =intValueType;
//         /*Automatically cast from low datatypes to hogh datatypes */
//         /*Explict Casting */
//         double doubleValueType= 190.8190;
//         int doubleValueConvertedToInt = (int) doubleValue;
//         /*Manually specify data type for eg int */
//         /*Note type cast can only be done  in primitive data types */
//         /*task
//          * Make one double variable called doubleVar1=100.12
//          * Explicitly cast the variable into float, floatVar1
//          * Expicitly cast the floatVar1 into int ,intVar1
//          * Make a string variable with "The integer is"
//          * Print the string variable and print int variable in another Variable
//          */
//     }
// }


import java.util.Scanner; 
public class Variable { 
public static void main(String[] args) { 
	Scanner scanner= new Scanner(System.in); 
    System.out.print("Enter your age: ");
	int age=scanner.nextInt(); 
	if (age >= 18) {
        System.out.println("You are eligible to vote.");
    } else {
        System.out.println("You are not eligible to vote.");
    }

    // Close the scanner
    scanner.close();
	} 
}



// import java.util.Scanner;

// public class Variable {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the principal amount: ");
//         double principal = scanner.nextDouble();

//         System.out.print("Enter the rate of interest (in percentage): ");
//         double rateofInterest = scanner.nextDouble();

//         System.out.print("Enter the time period (in years): ");
//         double timePeriod = scanner.nextDouble();

//         double simpleInterest = (principal * rateOfInterest * timePeriod) / 100;


//         System.out.println("Simple Interest: " + simpleInterest);

//         scanner.close();
//     }
// }