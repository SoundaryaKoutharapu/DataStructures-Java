import java.util.Scanner;

public class Prog02 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s1 = "", s2 = "";
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        System.out.println(appendThemTogether(s1, s2));
    }

    static String appendThemTogether(String a, String b) {
        String s = "";
        if (a.charAt(a.length()-1) == b.charAt(0)) {
            s = a.substring(0, a.length()-2) + b;
        }
        else {
            s = a + b;
        }
        s.toLowerCase();
        return s;
	}
}