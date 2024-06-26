package week1;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        /*while takes boolean expression inside()
         * The loop will run repeatatively when the boolean is true
         * if the boolean is false the loop will end
         */
        while(count<5){
            System.out.println("While loop "+ count);
            ++count;

        }
        /*In while loop the condition is cheaked at the begining 
         * if the condition is false in the initial check the loop will not run
        */
        System.out.println("please type the value between 0-100");
        Scanner scan  = new Scanner(System.in);
        int inputValue = scan.nextInt();
        while(inputValue < 0 || inputValue > 100){
            System.out.println("please input between 0 - 100");
            inputValue = scan.nextInt();

        } 
        System.out.println("End loop");
        scan.close();

    }
    
}
