import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = input.nextInt();


        System.out.print("Enter Num2: ");
        int num2 = input.nextInt();

        System.out.print("Enter Num3: ");
        int num3 = input.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("Maximum num is "+num1);
            }            
        }else if(num2>num3){            
                System.out.println("Maximum num is "+num2);            
        }else{
            System.out.println("Maximum num is "+num3);
            }
            
        }

    }
    
