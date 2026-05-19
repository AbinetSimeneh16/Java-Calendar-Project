import java.time.DayOfWeek;
import java.time.LocalDate;
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
        int days;
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 )
        {
            days=31;
        }
        else if (month==4 || month==6 || month==9 || month==11)
        {
            days=30;
        }
        else
        {
            if((year%4==0 && year%100 !=0) || year% 400==0)
            {
                days=29;
            }
            else
            {
                days=28;
            }
        }
        LocalDate date=LocalDate.of(year,month,1);
        DayOfWeek day=date.getDayOfWeek();
        String text=String.valueOf(year);
        String t=String.valueOf(month);
        System.out.println(text + " "+ t);
        System.out.println('S'+"   "+'M'+"   "+'T'+"   "+'W'+"   "+'T'+"   "+'F'+"   "+'S'+"   ");
        int z;
        if( days==31)
        {
            z=31;
        }
        else if (days==30)
        {
            z=30;
        }
        else
        {
            z=29;
        }
        int[] d=new int[z];
        for(int i=0;i<z;i++)
        {
            d[i]=i+1;
        }
        int space=0;

        if(day==DayOfWeek.SUNDAY)
        {
            for(int i=0;i<d.length;i++)
            {
                if(space<6)
                {
                    String str=String.valueOf(d[i]);
                    if(str.length()>2)
                    {
                        System.out.print(d[i]+"  ");
                    }
                    else
                    {
                        System.out.print(d[i]+"   ");
                    }
                }
                else
                {
                    System.out.println(d[i]);
                    space=space-6;
                }
                space++;
            }

        }
    }
}
