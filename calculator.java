import java.util.Scanner;

public class calculator{

    public static void main(String[] args){
        System.out.print("This is the Mortagage calculator: ");
        System.out.print("Please Enter the value of the Principle Amount: ");
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        System.out.print("Enter the Interest rate you had borrowed the Money:");
        Scanner inputRate = new Scanner(System.in);
        double Rate = inputRate.nextDouble();
        System.out.print("Enter the Time you had borrowed the Money (Years):");
        Scanner inputTimeperiod = new Scanner(System.in);
        double Timeperiod = inputTimeperiod.nextDouble();
        double total =  ((price*Rate*Timeperiod)/100);
        System.out.println("The value of the Interest is :" + total);
        System.out.println("The total Amount you will get in Madturity is:"+(total+price));
        System.out.println("The principle amount is:"+price);

    }
}