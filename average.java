import java.util.*;

public class average {
    public static void main(String args[]) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter 3 numbers : ");
        int a=r.nextInt();
        int b=r.nextInt();
        int c=r.nextInt();
        double avg=(a+b+c)/3;
        System.out.println(avg);
        r.close();
    }
}
