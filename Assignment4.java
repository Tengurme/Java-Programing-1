class Circle{
    private double radius ;
    private String color ;
    //default
    Circle(){
        this(1.0,"red");
    }
    Circle(double val,String col){
        this.radius = val;
        this.color = col;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.1415*this.radius*this.radius;
    }
}
public class Assignment4 extends Circle{
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
    }
}
