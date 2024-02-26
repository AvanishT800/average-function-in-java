import java.util.*;
public class Averagefunction {
    public static double averageOf3Numbers(double a , double b , double c){
        double P=(a+b+c)/3;
        return P;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double a= sc.nextDouble();
        System.out.println("enter second number");
        double b=sc.nextDouble();
        System.out.println("enter third number");
        double c=sc.nextDouble();
        double P= averageOf3Numbers(a,b,c);
        System.out.println("average is "+P);

    }
}
