
public class ArrayFound 
{
   public static void main(String[] args)
    {
    int [] array = {12,34,56,7,890,1,24,5};
    int num= 56;
    int ans=element(array,num);
    System.out.println(ans);   
   }    

   static int element(int[] a,int num)
   {
       int start=0;
       int end = a.length-1;
       while(start<=end)
       {
            int mid= start+(end-start)/2;
            if(num<a[mid])
             {
               end=mid-1;
             }
            else if(num>a[mid])
            {
              start=mid+1;
            }
            else
           {
             return mid;
           }
      }
           return -1;
   }
}
