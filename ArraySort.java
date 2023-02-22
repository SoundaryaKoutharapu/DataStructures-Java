
public class ArraySort
{
    public static void main(String[] args) 
    {
        int [] array = {12,34,-8,4,98,2,56,-3,76,3,64};
        int temp;
        System.out.println("after sorting");
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
               if(array[i]<array[j])
                {
                 temp=array[i];
                 array[i]=array[j];
                 array[j]=temp;
                }
           } 
           
        }
        for(int j=0;j<array.length;j++)
        {
            System.out.println(array[j]);
        }
   }
}
