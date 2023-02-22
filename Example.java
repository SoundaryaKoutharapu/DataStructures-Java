import java.util.*;

class Example 
{
     public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter testcase no:");
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
         {

            try
            {
                //System.out.println("enter value:");
                Long x=sc.nextLong();
                if(x>=-128 && x<=127)
                {
                   System.out.println(x+" can be fitted in:\n *byte");
                   System.out.println("*short");
                   System.out.println("*int");
                    System.out.println("*long");
                }

                else if(x>=-32768 && x<=32767)
                {
                    System.out.print(x+" can be fitted in:\n*short\n");
                    System.out.println("*int");
                    System.out.println("*long");
                }

                else if (x>=-2147483647 && x<=2147483647)
                {
                    System.out.print(x+" can be fitted in:\n*int\n");
                    System.out.println("*long");
                } 
                else if (x>=-9223372036854775808L && x<=9223372036854775807L )
                {
                    System.out.println(x+" can be fitted in:\n*long");
                } 
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}
