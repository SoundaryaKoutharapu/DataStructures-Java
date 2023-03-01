import java.util.Scanner;
/* import java.util.HashMap;
public class CommonChar 
{
       public static void main(String[] args)
        {
             Scanner sc = new Scanner(System.in);

             System.out.println("Enter string1");
             String str1 = sc.nextLine();

             System.out.println("Enter string2");
             String str2 = sc.nextLine();

             char[] arr = str1.toCharArray();
             char[] arr2 = str2.toCharArray();

             HashMap<Character,Integer> hMap = new HashMap<>();
             HashMap<Character,Integer> hMap2 = new HashMap<>();

             for(int i = 0 ; i < arr.length ; i++) 
             {
                if(!hMap.containsKey(arr[i]))
                 {
                hMap.put(arr[i],1);
                 }
             }

            for(int i = 0 ;i <arr2.length ;i++)
             {

             if(hMap.containsKey(arr2[i]))
              {
                hMap2.put(arr2[i],1);
              }
             }
          System.out.println("Number of matching characters in a pair of Java string is : " + hMap2.size());
       }
    } 
*/

public class CommonChar
{
   static int cmnchar(String s1, String s2)
   {
      int count=0;
      s1 = s1.toLowerCase();
      s2=s2.toLowerCase();

    for(int i=0;i<s1.length();i++)
    {
       for(int j=0;j<s2.length();j++)
       {
            if(s1.charAt(i)==s2.charAt(j))
            {
               count+=1;
               break;
            }
            
      }
    }

      return count;
      
   }
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter string1");
     String s1= sc.nextLine();
     System.out.println("Enter string2");
     String s2= sc.nextLine();
    
     System.out.println(cmnchar(s1, s2));
sc.close();
   }
}













