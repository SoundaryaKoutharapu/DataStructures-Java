public class LargeSmall
{
    public static void main(String[] args) 
    {
        int [] num = {2, 5, 14, 1, 26, 65, 123, 6};
        int temp;
        
        for(int i = 0; i < num.length; i++)
        {
            for(int j=0;j<num.length;j++)
            {
               if(num[i]<num[j])
                {
                  temp = num[i];
                  num[i] = num[j];
                  num[j] = temp;
                } 
            }
       }
            System.out.println("");
            System.out.println("the second largest element is:" + num[num.length-1]);

            System.out.println("");
            System.out.println("the second largest element is:" + num[num.length-2]);

            System.out.println("");
            System.out.println("the smallest element is:" + num[0]);

            System.out.println("");
            System.out.println("the second smallest element is:" + num[1]);

    }
}