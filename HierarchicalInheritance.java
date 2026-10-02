interface Area {
    double compute(double x, double y);
}
class Rect implements Area  {
    public double compute(double x, double y){
        return x*y;
    }
}
class Tri implements Area  {
    public double compute(double x ,double y){
        return (x*y)/2;
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args){
        Rect r = new Rect();
        Tri t = new Tri();

        System.out.println("The Area of the rectangle is: " + r.compute(10,20));
        System.out.println("The Area of the triangle is: " + t.compute(10.2,20));
    }
}