import java.util.Scanner;

public class Form {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.next();

        System.out.print("Enter your address: ");
        String address = input.next();

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        System.out.println("A. Show Student Name");
        System.out.println("B. Show Address");
        System.out.println("C. Show Marks");

        System.out.println();

        System.out.print("-->");
        String letter = input.next();

        
        switch(letter){
            case "A":
                System.out.print("Student name is "+name);
                break;
            case "B":
                System.out.print("Student address is "+address);
                break;
            case "C":
                System.out.println("Student mark is "+marks);
                if(marks>=75){
                    System.out.println("Pass");
                }else{
                    System.out.println("Fail");
                }
                break;
            default:
                System.out.print("Invalid Entry");
        }

    }
    
}
