import java.io.*;
public class FileExampleBufferRead {
    public static void main(String[] arr) throws IOException{
        int ch;
        BufferedReader br=new BufferedReader(new FileReader("Name3.text"));
        while((ch=br.read()) != -1){  //-1 file end 
            System.out.print((char)ch);
        }
        br.close();
    }
}
