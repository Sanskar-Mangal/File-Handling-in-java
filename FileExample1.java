import java.io.File;
import java.io.IOException;
//import java.io.*;
public class FileExample1{
    public static void main (String[] arr) throws IOException{
        File f1=new File("D:/CDAC JAVA/Filehandling/Name1.txt");  //OBJECT HAI YHE
        //System.out.println("IS EXIST:" +f1.exists()); //CHECK FILE HAI KI NHI TRUE FALSE MAI RETURN HOGA
        f1.createNewFile(); //CREATE NEW FILE
        System.out.println("Can file read " +f1.canWrite()); 
        System.out.println("IS EXIST:" +f1.exists()); //CHECK FILE HAI KI NHI TRUE FALSE MAI RETURN HOGA
        System.out.println("File Name :" +f1.getName()); //FILE NAME SHOW
        System.out.println("File Size :" +f1.length());  //SIZE OF FILE

        //f1.delete(); //DELETE FILE 
    }
}