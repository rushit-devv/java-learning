interface Area {
    double pi = 3.14;
    double compute(double x);
}
class Square implements Area {
    public double compute(double x){
        return x*x;
    }
}
class Circle implements Area {
    public double compute(double x){
        return pi*x*x;
    }
}
public class HierarchicalInheritance2{
    public static void main(String[] args){
        Square s = new Square();
        Circle c = new Circle();

        System.out.println("The Area of Square is: " + s.compute(5.55));
        System.out.println("The Area of Circle is: " + c.compute(4.5));
    }
}
