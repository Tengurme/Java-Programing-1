import java.util.Scanner;

//Creating Complex class
class complex {
    int real;
    int imaginary;

    public complex(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public complex add(complex b){
        return new complex(this.real+b.real,this.imaginary+b.imaginary);
    }
    public complex sub(complex b){
        return new complex(this.real-b.real,this.imaginary-b.imaginary);
    }
    public complex mul(complex b){
        return new complex(this.real*b.real,this.imaginary*b.imaginary);
    }
    public complex div(complex b){
        return new complex(this.real/b.real,this.imaginary/b.imaginary);
    }
}

public class Assignment_5 {

    Assignment_5(){
        Scanner sc = new Scanner(System.in);
        try {
            complex a = new complex(sc.nextInt(),sc.nextInt());
            complex b = new complex(sc.nextInt(),sc.nextInt());
            System.out.println(a.add(b));
            System.out.println(a.sub(b));
            System.out.println(a.mul(b));
            System.out.println(a.div(b));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Assignment_5 assign = new Assignment_5();
    }
}
