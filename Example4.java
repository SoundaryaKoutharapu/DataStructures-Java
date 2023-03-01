import java.time.LocalDate;
import java.util.Scanner;

public class Example4 
{
    public static String findDay(int month, int day, int year) 
    {
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString();
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print(findDay(n, n1, n2));
        sc.close();
    }
        
}
