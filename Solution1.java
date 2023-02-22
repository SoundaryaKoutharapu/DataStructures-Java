import java.util.Scanner;

public class Solution1 
{
        public void solution(int N) 
        {
            int enable_print = N % 10;
            while (N > 0) 
            {
                if (enable_print == 0 && N % 10 != 0) 
                {
                    enable_print = 1;
                }
                else if (enable_print == 1)
                 {
                    System.out.print(N % 10);
                }
                N = N / 10;
            }
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter n value");
            int n = sc.nextInt();
            Solution1 s = new Solution1();
            s.solution(n);
        }
    }  
