import java.io.*;
class Student implements Serializable{
    int rno;
    String name;
    int total_marks;

    Student(int rno,String name,int total_marks){
        this.rno=rno;
        this.name=name;
        this.total_marks=total_marks;
    }

    public String toString(){
        return rno+" "+name+" "+total_marks;
    }
}
public class Writeobject {
    public static void main(String[] arr) throws IOException{
    File file=new File("Student.txt");
    Student s1=new Student(101,"sanskar",455);
    System.out.println(s1); 

    ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
    oos.writeObject(s1);
    oos.close();
    }
}
