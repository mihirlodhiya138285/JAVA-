import java.util.Scanner;
import java.util.Scanner;
public class NameLoop_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String name = sc.nextLine();

        
        for (int i = 1; i <= 10; i++) 
	{
            System.out.println( "" + name);
        }

        
        sc.close();
    }
}
