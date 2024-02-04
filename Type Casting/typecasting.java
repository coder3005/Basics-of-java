package TypeCasting;
import java.util.*;

public class typecasting {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float a=25.12f;
        int b=(int)a; // if we write int b=a it will give error
        System.out.println(b);
        sc.close();
    }
}
