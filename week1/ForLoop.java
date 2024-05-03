package week1;

public class ForLoop {
    public static void main(String[] args) {
        /*Use for loop when condition is fixed */
        for(int index = 0; index < 5; index ++){
            System.out.println("Loop running " + index);
        }

        /*Decrement loop */
        for(int index = 10; index >=0 ; index --){
            System.out.println("Loop running " +index);
        }
        for(int index = 1; index < 11; index ++){
            System.out.println("2 x " + index +"="+index*2);
        }

        /*Nested loop */
        for(int outer = 0;outer < 3; outer ++){
            for(int inner = 2; inner >= 0; inner --){
                System.out.println("Inner "+ inner);
            }
            System.out.println("Outer "+ outer);
        }

        // Task use nested loop to do the following
        // Make multiplication table from 1 - 10
        for(int outer = 1;outer <= 10; outer ++){
            System.out.println("Multiplication of "+ outer);
            for(int inner = 1; inner <= 10; inner ++){
                System.out.println(outer+ " x "+inner+" = "+inner*outer);
            }
       
        }
        }
}

