package TypePromotion;
public class typepromotion2 {
    public static void main(String[] args) {
        int a=10;
        float b=20.25f;
        long c=25;
        double d=30;
        double ans=a+b+c+d; // in place of double we can't write int or any other datatype which less than double
        System.out.println(ans);
    }    
}
