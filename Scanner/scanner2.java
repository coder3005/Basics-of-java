package scanner;

import java.util.*;

public class scanner2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        double b=scan.nextDouble();
        scan.nextLine();
        String c=scan.nextLine();
        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
        scan.close(); // 8 loc me scan ke neeche yellow line nahi aayegi
    
    }   
}
