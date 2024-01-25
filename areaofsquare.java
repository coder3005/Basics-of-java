import java.util.*;

public class areaofsquare {
    public static void main(String[] args) {
        System.out.println("enter side of square : ");
        Scanner r=new Scanner(System.in);
        int side=r.nextInt();
        int area=side*side;
        System.out.print(area);
        r.close();
    }
    
}
