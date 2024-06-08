import java.util.*;
public class calculator {
    public static void main(String args[]){
        System.out.println(" //////////////CALCULATOR IN JAVA//////////// ");

        Scanner sc= new Scanner(System.in);
        System.out.println(" ENTER FIRST NUMBER: ");
        int a= sc.nextInt();
        System.out.println(" ENTER SECOND NUMBER: ");
        int b=sc.nextInt();
        System.out.println(" ENTER OPERATOR: ");
        char OPERATOR=sc.next().charAt(0);
        
        switch (OPERATOR) {
            case '+':
                
            System.out.print(a+b);
            break;
            
            case '-':

            System.out.println(a-b);
            break;

            case '*':

            System.out.println(a*b);
            break;

            case '/':

            System.out.println(a/b);
            break;

            case '%':

            System.out.println(a%b);
            break;


            default:
            System.out.println("WRONG OPERATOR ENTERED");

                break;
        }
        System.out.println("MADE BY SHOURYA SRIVASTAVA");


    }
    
}
