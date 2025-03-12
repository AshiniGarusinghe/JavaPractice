import java.util.Scanner;

public class Number {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();

        
        if(num==3){
            return;
        }else{
            System.out.println("Enter number is "+num);
        }
         
        for(int i=0;i<10;i++){
            if(i==2){
                return;
            }else{
                System.out.println(i);
            }
        }
        
    }
    
}
