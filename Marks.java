import java.util.Scanner;
public class Marks {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks=input.nextInt();

        if(marks>=75){
            System.out.println("A");            
        }else if(marks>=65){
            System.out.println("B");
        }else if(marks>=55){
            System.out.println("C");
        }else if(marks>=35){
            System.out.println("S");
        }else{
            System.out.println("F");
        }
    
}
}