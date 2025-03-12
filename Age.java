import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = input.nextInt();

        if(age>=35){
            System.out.println("Your are a elder");
        }else if(age>=18){
            System.out.println("Your are a young");
        }else{
            System.out.println("Your a child");
        }
    }
}
