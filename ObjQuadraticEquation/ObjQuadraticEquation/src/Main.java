import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a= sc.nextDouble();
        System.out.println("Nhập b: ");
        double b= sc.nextDouble();
        System.out.println("Nhập c: ");
        double c= sc.nextDouble();
        QuadraticEquation Pt = new QuadraticEquation(a,b,c);
        Pt.check();
    }
}
