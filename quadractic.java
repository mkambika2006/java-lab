import java.util.Scanner;

public class quadractic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a:");
        double a=sc.nextDouble();

        System.out.println("Enter the value of b:");
        double b=sc.nextDouble();

        System.out.println("Enter the value of c:");
        double c=sc.nextDouble();

        double discriminant=b*b-4*a*c;

        if(discriminant>0){
            double x1=(-b+Math.sqrt(discriminant))/2*a;
            double x2=(-b-Math.sqrt(discriminant))/2*a;

            System.out.println("Two real solutions:");
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }else if(discriminant==0){
            double x=-b/(2*a);
            System.out.println("One real solution:");
            System.out.println("x="+x);
        }else{
            System.out.println("No real solution Discriminant is negative.");
        }
        sc.close();
    }
}
