import java.util.Scanner;
class BaseClass {
    int height, width;

    public BaseClass() {
        this.height = 0;
        this.width = 0;
    }

    public void display() {
        System.out.println(width+ " " +height);
    }
}
public class Assignment_2 extends BaseClass{
    Scanner sc = new Scanner(System.in);
    public void read_Input()throws Exception{
        height = sc.nextInt();
        width = sc.nextInt();
        if(height<=0||height>=1001||width<=0||width>=1001){
            throw new Exception("Value out-of-bound");
        }
    }
    @Override
    public void display(){
        super.display();
        System.out.println(height*width);
    }
    public static void main(String[] args)throws Exception{
        Assignment_2 rect = new Assignment_2();
        try{
            rect.read_Input();
        }catch (Exception e){
            System.out.println(e);
            return;
        }
        rect.display();

    }
}

