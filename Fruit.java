 class Fruits
{
    String name;
    String taste;
    int size;

    void eat(String sapota,String sweet)
    {
        this.name = sapota;
        this.taste = sweet;
        System.out.println("fruit is sapota and the taste is sweet");

    }
}    
    class Apple extends Fruits
    {
        void eat(String apple, String sweet)
        {
          this.name= apple;
          this.taste=sweet;
          System.out.println("fruit is apple and the taste is sweet");
        }
    }

    class Orange extends Fruits
    {

        void eat(String lemon, String sour)
        {
            this.name=lemon;
            this.taste=sour;
            System.out.println("fruit is lemon and the taste is sour");
        }
    }
public class Fruit
{
 public static void main(String[] args) 
 {
     Fruits f = new Fruits();
     f.eat("","");

     Apple a = new Apple();
     a.eat("","");
    
     Orange o = new Orange();
     o.eat("","");
 }

}
