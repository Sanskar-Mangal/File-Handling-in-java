import java.io.*;
public class FileExampleBufferWrite {
    public static void main(String [] arr) throws IOException{
        FileWriter fw=new FileWriter("Name3.text",true);
        BufferedWriter bf=new BufferedWriter(fw);
        bf.write("Hello Sanskar! \n");
        bf.close();

    }
}
