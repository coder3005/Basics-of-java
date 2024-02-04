package scanner;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String args[]) {
        Scanner r=new Scanner(System.in);
        String input=r.next();
        System.out.println(input);

        String name = r.nextLine();
        System.out.println(name);

        int number=r.nextInt();
        System.out.println(number);

        float price=r.nextFloat();
        System.out.println(price);
        r.close();
        
    }
}
