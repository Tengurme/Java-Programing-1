
class Custom_Exception extends Exception
{
    public Custom_Exception()
    {
        super("String Detected instead of Integer");
    }
}
class genericClass{


    public <T> void generic_Fun(T... per){
        int itemsToPrint = (per.length * 2)/3;
        try{
            for(T i : per){
                if(i instanceof String){
                    throw new Custom_Exception();
                }
            }
            for(int i = 0; i <= itemsToPrint ; i ++){
                System.out.println(per[i]);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class Assignment_8 {
    Assignment_8(){
        genericClass gen = new genericClass();

        gen.generic_Fun(3,5,6,"erw");
        gen.generic_Fun(1,5,1,4,2,3,1,5,2);
    }

    public static void main(String[] args) {
        Assignment_8 assign = new Assignment_8();
    }
}
