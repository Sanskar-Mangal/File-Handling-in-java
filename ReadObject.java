import java.io.*;
public class ReadObject {
    public static void main(String[] arr) throws IOException, ClassNotFoundException{
    File file=new File("Student.txt");

    ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
    Student s1=(Student)ois.readObject();
    ois.close();
    System.out.println(s1);
    }
}
