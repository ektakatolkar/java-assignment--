class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }
}
public class Assignment29{
    public static void main(String[] args){
        Student s=new Student(1,"Rahul");
        System.out.println(s);
    }
}