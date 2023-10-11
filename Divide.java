import java.util.Scanner;

public class Divide {
   public static void main(String[] args) {
        System.out.println("Enter Your Number  : ");
          Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.printf("Divide of the %d  and %d is %d ",num1,num2,num1/num2);
   }    
}
