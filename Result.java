import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Letter: ");
        String letter = input.next();

        switch(letter){
            case "A":
                System.out.println("Apple");
                break;
            case "B":
                System.out.println("Banana");
                break;
            case "C":
                System.out.println("Cherry");
                break;
            default:
                System.out.println("Invalid ENTRY");
                      

        }
    }
}
