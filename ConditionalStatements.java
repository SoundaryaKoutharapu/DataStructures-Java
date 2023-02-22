public class ConditionalStatements {
    public static void main(String args[])
    {
        String a="banana";
        switch(a)
        {
            default:
            System.out.println("all are invalid");

            case "apple":
            System.out.println("not correct");
        
            case "grapes":
            System.out.println("not valid");
            break;
            case "banana":
            System.out.println("match found");
            break;
    
        }

    
}
}

