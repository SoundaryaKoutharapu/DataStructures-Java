import java.util.Scanner;

public class Patient 
{ 
    String name;
     
    // constructor
      public  Patient(String str)
        {
            name  =  str;
        }


    double bmi(double w, double h)
    {

        double bm = (w/ (h*h))*703 ;
        return bm;
    }

    //inner class
    
    static class Patients
        {
        public static void main (String[] args)
            {
        Patient p = new Patient("HIMA");
        System.out.println( "name is:"  +p.name );
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter weight:");
        double w = sc.nextDouble();
        System.out.println("enter height:");
        double h = sc.nextDouble();
        System.out.println(" the body mass index of patient is:"+ p.bmi(h,w));
        
        sc.close();
        }
    }
}
