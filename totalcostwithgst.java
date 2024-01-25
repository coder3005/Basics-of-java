import java.util.*;

public class totalcostwithgst {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter the cost of pencil, pen and eraser respectively : ");
        float a=r.nextFloat();
        float b=r.nextFloat();
        float c=r.nextFloat();
        float Total=(a+b+c);
        System.out.println("Total price without gst  is " + Total);
        float gst=0.18f;
        float totalgst=Total + (Total*gst);
        System.out.println("Total price with gst is " + totalgst);
        r.close();
    }
}
