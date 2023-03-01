import java.util.Scanner;

public class DuplicateElements 
{

    static void removeduplicate(int[] a,int n)
    {
        int j=0;
        int [] temp =new int[a.length];
        for(int i=0;i<n-1;i++)
          {
                 if(a[i]==a[i+1])
                 {
                    temp[j]=a[i];
                    j++;
                 }
                 temp[j]=a[n-1];
          }
          for(j=0;j<n;j++)
          {
          System.out.println(temp[j] + "");
          }
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length:");
        int n = sc.nextInt();

        int[] array = new int[30];
        System.out.println("enter the array elements:");
        for(int i=0;i<array.length;i++)
        {
             array[i]=sc.nextInt();
             
        }     
        removeduplicate(array, n);
        sc.close();
     }

}
