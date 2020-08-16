import java.util.*;
public class Assignment_6 {
    static class Employee{
        String name, Add;
        int joiningYr;
        public Employee(String n,String add,int yr){
            this.name = n;
            this.Add = add;
            this.joiningYr = yr;
        }
        public String toString(){
            String new_name = this.name+Padding(8-this.name.length());
            String new_year = this.joiningYr+Padding(16);

            return new_name+new_year+Add;
        }
        public String Padding(int len){
            String str="";
            for(int i=0;i<=len;i++){
                str+=" ";
            }
            return str;
        }
    }

    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<>();
        try{
            list.addLast(new Employee("Robert","64C-WallStreet",1994));
            list.addLast(new Employee("Sam","68D-WallStreet",2000));
            list.addLast(new Employee("John","26B-WallStreet",1999));
        }catch (Exception e){}
        System.out.println("Name     Year of Joining      Address");
        list.stream().forEach(e->{
            System.out.println(e);
        });
    }
}
