import java.util.Scanner;

class triangle{
    double a,b,c;
    public void input_side(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void area(){
        if((a+b)>c && (a+c)>b && (b+c)>a)
        {
            double s=(a+b+c)/2;
            double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of Triangle is: " + area);
        }
        else
            System.out.println("Area of Triangle not exit");
    }
}
public class Assignment_7 {
    Assignment_7(){
        Scanner sc = new Scanner(System.in);
        try{
            triangle t1 = new triangle();
            t1.input_side(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            t1.area();
        }catch (Exception e){}
    }



    public static void main(String[] args) {
        Assignment_7 abc = new Assignment_7();
    }
}
