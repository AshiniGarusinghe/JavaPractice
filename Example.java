import java.util.Scanner;
class Example{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.println("Hello Java");
        System.out.print("Enter Number1:");
        int num = input.nextInt();
        
        System.out.println("your num is "+num);

        System.out.println("Enter your salary");
        int salary =input.nextInt();

        int result = salary/5000;
        salary=salary%5000;
        System.out.println("no.of 5000 is "+result);
        System.out.println("NET VALUE"+salary);
        ;

    }
    
}
