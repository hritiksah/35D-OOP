package week1;

public class SwitchCase {
    public static void main(String[] args) {
        char value = 'b';
        int intVal = 10;
        switch(value){
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("cat");
                break;
            default:
                System.out.println("No word found");
                break;            

        }
    }
    
}
