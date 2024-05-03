package week1;

// public class OperatorClass {
//     public static void main(String[] args) {
//         /*Arithemtic Operators */
//         int a = 10, b = 10;
//         int sum = a + b; //here the "+" is an arithemtic operator
//         System.out.println("Addition for a=b is " + sum);
//         System.out.println("Difference for a-b is  " + (a-b));
//         System.out.println("Multiplication for axb is "+ (a*b));
//         System.out.println("Division for a/b  " + (a/b));
//         System.out.println("Modulo for a and b is " + (a%b));

//         /* Assignment Operators */
//         int aNumber1;
//         aNumber1 = 10;
//         /* or declare and assign */
//         int aNumber2 = 20;
//         /* assign with another variable */
//         int aNumber3 = aNumber1;
//         System.out.println("Assignent with += " + (aNumber1+=10));
//         aNumber2 -= 30; // same as aNumber2 = aNumber2 - 30;
//         System.out.println("Assignment with -=" + aNumber2);
//         /*relational Operators */
//         int rNumber1 = 10, rNumber2 = 20;
//         System.out.println("rNumber1 equal to rNumber2? " + (rNumber1 == rNumber2));
//         System.out.println("rNUmber1 greater that rNumber2?" + (rNumber1> rNumber2));
//         System.out.println("rNUmber1 less that or equals to rNumber2?" + (rNumber1<= rNumber2));
//         System.out.println("rNUmber1 not equal to rNumber2?" + (rNumber1!= rNumber2));
//         /*Logical Operators */
//         int lNumber1 = 10, lNumber2 = 12;
//         boolean lExpression1 = lNumber1 == lNumber2;
//         boolean lExpression2 = lNumber1 <= lNumber2;
//         System.out.println("And operator uses && " + (lExpression1 && lExpression2));
//         System.out.println("or operator uses || " + (lExpression1 || lExpression2));
//         System.out.println("Not operator uses ! " + !lExpression1);

//         /* Unary Operator */
//         int uNUmber1 = 10;
//         uNUmber1++; // meanung uNumber1 = uNumber1 + 1;
//         System.out.println("Unary for increamt is ++ " + uNUmber1);
//         uNUmber1--;
//         System.out.println("Unary for increamt is -- " + uNUmber1);

//         /*Ternary operator */
//         int tNumber1 = 20, tNumber2 = 20;
//         boolean tExpression = tNumber1 == tNumber2;
//         /*
//          * one line if else ,see the give example in if else
//          * string output
//          * if(tExoression == true){
//          * output = "True "
//          * }
//          */

//     }
    
// }


//1
 public class OperatorClass {
    public static void main(String[] args) {
       int a = 18;
        if (a >= 18) {
            System.out.println("yes.");
        } else {
            System.out.println("no");
        }
        
        int Amount = 1000, Time = 3, Rate = 2;
        System.out.println("simple interest: " + (Amount*Time*Rate/100));

        
        int Length = 10, Width = 12, Height = 11;
        System.out.println("Volume of the cuboid: "+ (Length*Width*Height));
        
        
        int Side1 = 1, side2 = 2, side3 = 3;
        System.out.println("volumn of the cube: "+ Side1*side2*side3);
  

    
    }
 }


