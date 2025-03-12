import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        for(int i=1;i<10;i++){
            System.out.println("Hello "+i);
        }
        for(int i=0;i<4;i++){
            System.out.println("****");
        }
        for(int i=1;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int max=0;
        int sum=0;
        for(int i=1;i<=5;i++){
            System.out.print("Enter Num "+i+":");
            int number= input.nextInt();
            sum=sum+number;
            if(max<number){
                max=number;
            }
            
    }
    System.out.println("maxmim num is "+max);
    System.out.println("sum is "+sum);

        }
}
