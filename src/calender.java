import java.util.Scanner;
public class calender {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the month of the year. please enter it in numbers");
        int month= scanner.nextInt();
        boolean x=true;
        while (x)
        {
            if (month>12 || month<1)
            {
                System.out.println("invalid input.please re-enter again");
                month= scanner.nextInt();
            }
            else
            {
                x=false;
            }

        }
        System.out.println("Enter the year");
        int year= scanner.nextInt();
        boolean y=true;
        while (y)
        {
            if(year<0)
            {
                System.out.println("invalid input.please re-enter again");
                year= scanner.nextInt();
            }
            else {
                break;
            }
        }
    }
}
