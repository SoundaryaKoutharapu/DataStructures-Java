import java.util.Scanner;

public class FirstUpperLetter
 {

   static void firstupper(String str)
   {

    char[] charArray = str.toCharArray();
    boolean foundSpace = true;

    for(int i = 0; i < charArray.length; i++) 
    {
      if(Character.isLetter(charArray[i])) 
      {

        if(foundSpace) 
        {

          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;

        }
      }

      else 
      {
         foundSpace = true;
      }
    }
      str = String.valueOf(charArray);
      System.out.println("Message: " + str);
   }
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter string:");=
       String str = sc.nextLine();
       firstupper(str);
   }
}

