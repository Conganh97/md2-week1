public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return (b*b - 4*a*c);
    }
    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant()))/2*a;
    }
    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant()))/2*a;
    }
    public void check (){
        if (getDiscriminant() >0){
            System.out.println("Nghiệm thứ 1: "+getRoot1());
            System.out.println("Nghiệm thứ 2: "+getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("Phương trình có 2 nghiệm bằng nhau: "+getRoot1());
        } else System.out.println("Phương trình vô nghiệm");
    }
}
